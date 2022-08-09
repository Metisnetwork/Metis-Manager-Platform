package com.platon.datum.admin.grpc.channel;

import com.platon.datum.admin.common.exception.CannotConnectGrpcServer;
import com.platon.datum.admin.common.exception.CarrierNotConfigured;
import com.platon.datum.admin.common.exception.IdentityIdMissing;
import com.platon.datum.admin.dao.cache.OrgCache;
import com.platon.datum.admin.dao.entity.Org;
import com.platon.datum.admin.grpc.interceptor.TimeoutInterceptor;
import com.platon.datum.admin.grpc.interceptor.UploadFileTimeoutInterceptor;
import com.platon.datum.admin.dao.enums.CarrierConnStatusEnum;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Author liushuyu
 * @Date 2021/7/7 10:58
 * @Version
 * @Desc
 */

@Component
@Slf4j
public class SimpleChannelManager {
    @Resource
    private TimeoutInterceptor timeoutInterceptor;

    @Resource
    private UploadFileTimeoutInterceptor uploadFileTimeoutInterceptor;

    private ManagedChannel carrierChannel;

    public ManagedChannel buildChannel(String ip, int port) throws CannotConnectGrpcServer {
        try {
            ManagedChannel channel = ManagedChannelBuilder
                    .forAddress(ip, port)
                    .usePlaintext()
                    .keepAliveWithoutCalls(true)
                    .intercept(timeoutInterceptor)
                    .maxInboundMessageSize(1073741824)
                    .build();

            return channel;
        } catch (Throwable e) {
            log.error("failed to connect to gRPC server {}:{}", ip, port);
            throw new CannotConnectGrpcServer();
        }
    }

    public ManagedChannel buildUploadFileChannel(String ip, int port) throws CannotConnectGrpcServer {
        try {
            ManagedChannel channel = ManagedChannelBuilder
                    .forAddress(ip, port)
                    .usePlaintext()
                    .keepAliveWithoutCalls(true)
                    .intercept(uploadFileTimeoutInterceptor)
                    .maxInboundMessageSize(1073741824)
                    .build();

            return channel;
        } catch (Throwable e) {
            log.error("failed to connect to gRPC server {}:{}", ip, port);
            throw new CannotConnectGrpcServer();
        }
    }


    public void closeChannel(ManagedChannel managedChannel) {
        if (managedChannel == null) {
            return;
        }
        if (!managedChannel.isShutdown()) {
            try {
                managedChannel.shutdown();
                if (!managedChannel.awaitTermination(5, TimeUnit.SECONDS)) {
                    log.warn("Timed out gracefully shutting down connection: {}. ", managedChannel);
                }
            } catch (Exception e) {
                log.error("Unexpected exception while waiting for channel termination", e);
            }
        }

        // Forceful shut down if still not terminated.
        if (!managedChannel.isTerminated()) {
            try {
                managedChannel.shutdownNow();
                if (!managedChannel.awaitTermination(10, TimeUnit.SECONDS)) {
                    log.warn("Timed out forcefully shutting down connection: {}. ", managedChannel);
                }
            } catch (Exception e) {
                log.error("Unexpected exception while waiting for channel termination", e);
            }
        }
    }

    /**
     * 获取调度服务连接
     * carrier_conn_Status = 'enabled' and carrier_status = 'enabled'
     *
     * @return
     */
    public ManagedChannel getCarrierChannel() throws CarrierNotConfigured, CannotConnectGrpcServer {
        //获取调度服务的信息
        Org org = OrgCache.getLocalOrgInfo();

        if (StringUtils.isBlank(org.getIdentityId())) {
            throw new IdentityIdMissing();
        }

        if (!CarrierConnStatusEnum.ENABLED.getStatus().equals(org.getCarrierConnStatus())) {
            throw new CarrierNotConfigured();
        }

        if (carrierChannel == null) {
            carrierChannel = buildChannel(org.getCarrierIp(), org.getCarrierPort());
        }

        return carrierChannel;
    }
}
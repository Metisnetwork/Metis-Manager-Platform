package com.platon.metis.admin.grpc.channel;

import com.platon.metis.admin.grpc.interceptor.TimeoutInterceptor;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author liushuyu
 * @Date 2021/7/7 10:58
 * @Version
 * @Desc
 */

@Component
public class SimpleChannelManager extends BaseChannelManager{
    @Resource
    private TimeoutInterceptor timeoutInterceptor;

    @Override
    public ManagedChannel buildChannel(String ip,int port) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(ip, port)
                .usePlaintext()
                .keepAliveWithoutCalls(true)
                .intercept(timeoutInterceptor)
                .build();

        return channel;
    }


    @SneakyThrows
    public void closeChannel(Channel channel){
//        if(channel == null){
//            return;
//        }
//        if(channel instanceof ManagedChannel){
//            ManagedChannel managedChannel = (ManagedChannel)channel;
//            if(managedChannel.isTerminated()){
//                return;
//            }
//            managedChannel.resetConnectBackoff();
//            managedChannel.shutdown();
//            managedChannel.awaitTermination(10, TimeUnit.SECONDS);
//            managedChannel.shutdownNow();
//        }
    }
}

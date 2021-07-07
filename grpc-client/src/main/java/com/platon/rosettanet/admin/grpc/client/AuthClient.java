package com.platon.rosettanet.admin.grpc.client;

import com.platon.rosettanet.admin.grpc.AuthRpcMessage;
import com.platon.rosettanet.admin.grpc.CommonMessage;
import com.platon.rosettanet.admin.grpc.channel.BaseChannelManager;
import com.platon.rosettanet.admin.grpc.channel.SimpleChannelManager;
import com.platon.rosettanet.admin.grpc.service.AuthServiceGrpc;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author liushuyu
 * @Date 2021/7/7 10:24
 * @Version
 * @Desc
 */

@Component
public class AuthClient {

    @Resource(name = "simpleChannelManager")
    private BaseChannelManager channelManager;

    public void applyIdentityJoin(){
        //1.获取rpc连接
        Channel channel = channelManager.buildChannel("localhost", 50051);
        //2.拼装request
        AuthRpcMessage.ApplyIdentityJoinRequest joinRequest = AuthRpcMessage.ApplyIdentityJoinRequest.newBuilder().build();
        //3.调用rpc,获取response
        CommonMessage.SimpleResponseCode responseCode = AuthServiceGrpc.newBlockingStub(channel).applyIdentityJoin(joinRequest);
        //4.处理response
        System.out.println("###############" + responseCode.getMsg());
        System.out.println("111111111");
    }
}

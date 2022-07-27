package com.platon.datum.admin.service.impl;

import com.platon.datum.admin.service.IpfsOpService;
import com.platon.datum.admin.service.client.PinataClient;
import com.platon.datum.admin.service.client.dto.PinataPinJSONToIPFSReq;
import com.platon.datum.admin.service.client.dto.PinataPinResult;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @Author liushuyu
 * @Date 2022/7/22 18:33
 * @Version
 * @Desc
 */


@Service
public class PinataIpfsOpServiceImpl implements IpfsOpService {

    public static final String prefix_ipfs = "ipfs://";

    @Resource
    private PinataClient pinataClient;

    /**
     * 保存图片
     *
     * @return
     */
    @Override
    public String saveFile(MultipartFile file) {
        PinataPinResult pinataPinResult = pinFileToIPFS(file);
        return getIpfsLink(pinataPinResult);
    }

    /**
     * 保存json
     *
     * @return
     */
    @Override
    public String saveJson(Object content) {
        PinataPinResult pinataPinResult = pinJSONToIPFS(content);
        return getIpfsLink(pinataPinResult);
    }

    private String getIpfsLink(PinataPinResult pinataPinResult) {
        String ipfsHash = pinataPinResult.getIpfsHash();
        return prefix_ipfs + ipfsHash;
    }

    private PinataPinResult pinFileToIPFS(MultipartFile file) {
        PinataPinResult pinataPinResult = pinataClient.pinFileToIPFS(file);
        return pinataPinResult;
    }


    private PinataPinResult pinJSONToIPFS(Object content) {
        PinataPinJSONToIPFSReq req = new PinataPinJSONToIPFSReq();
        req.setPinataContent(content);
        PinataPinResult pinataPinResult = pinataClient.pinJSONToIPFS(req);
        return pinataPinResult;
    }

}

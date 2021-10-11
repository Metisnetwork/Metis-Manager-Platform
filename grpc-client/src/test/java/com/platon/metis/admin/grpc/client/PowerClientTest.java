package com.platon.metis.admin.grpc.client;

import com.alibaba.fastjson.JSON;
import com.platon.metis.admin.common.context.LocalOrgCache;
import com.platon.metis.admin.dao.LocalOrgMapper;
import com.platon.metis.admin.dao.entity.GlobalPower;
import com.platon.metis.admin.dao.entity.LocalOrg;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
@SpringBootTest(classes = TestApplication.class)
public class PowerClientTest {

    @Autowired
    LocalOrgMapper localOrgMapper;

    @Autowired
    PowerClient powerClient;

    @BeforeAll
    public void init(){
        LocalOrg localOrg = localOrgMapper.select();
        LocalOrgCache.setLocalOrgInfo(localOrg);;
    }
    @Test
    public void getGlobalPowerDetailList(){
        List<GlobalPower> globalPowerList = powerClient.getGlobalPowerDetailList();
        log.info("globalPowerList：" + JSON.toJSON(globalPowerList));
    }
}

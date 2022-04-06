package com.platon.metis.admin.dto.req;

import com.platon.metis.admin.dto.CommonPageReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author liushuyu
 * @Date 2022/4/1 17:06
 * @Version
 * @Desc
 */

@Getter
@Setter
@ToString
@ApiModel
public class LocalDataListMetaDataReq extends CommonPageReq {

    @ApiModelProperty(value = "0-查询所有状态，1-查询已发凭证，2-查询未发凭证")
    private int status = 0;
}

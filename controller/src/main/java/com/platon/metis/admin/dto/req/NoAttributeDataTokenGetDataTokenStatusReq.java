package com.platon.metis.admin.dto.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * @Author liushuyu
 * @Date 2022/3/24 11:39
 * @Version
 * @Desc
 */

@ApiModel
@Getter
@Setter
@ToString
public class NoAttributeDataTokenGetDataTokenStatusReq {

    @ApiModelProperty("dataToken的id")
    @NotNull
    private Integer id;
}

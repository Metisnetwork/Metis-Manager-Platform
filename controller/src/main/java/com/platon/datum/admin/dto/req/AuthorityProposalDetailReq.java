package com.platon.datum.admin.dto.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author liushuyu
 * @Date 2022/7/22 14:54
 * @Version
 * @Desc
 */

@Getter
@Setter
@ToString
@ApiModel
public class AuthorityProposalDetailReq {

    @ApiModelProperty(value = "提案id", required = true)
    private int id;
}

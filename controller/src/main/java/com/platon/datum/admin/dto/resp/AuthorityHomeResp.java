package com.platon.datum.admin.dto.resp;

import com.platon.datum.admin.dao.entity.Org;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author liushuyu
 * @Date 2022/7/22 12:21
 * @Version
 * @Desc
 */

@Getter
@Setter
@ToString
@ApiModel
public class AuthorityHomeResp extends Org {

    @ApiModelProperty("委员会成员数量")
    private int authorityCount;

    @ApiModelProperty("已发信任证书数量")
    private int approveCount;

    @ApiModelProperty("我的待办数量")
    private int todoCount;

    @ApiModelProperty("我的提案数量")
    private int proposalCount;
}

package com.platon.metis.admin.dto.req;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * 任务分页查询Req
 */
@Setter
@Getter
@ToString
@ApiModel(value = "计算任务列表请求参数")
public class TaskPageReq {

    @NotNull(message = "页码号不能为空")
    @ApiModelProperty(value = "起始页号，从1开始", example = "1", required = true)
    int pageNumber;

    @NotNull(message = "每页数据条数不能为空")
    @ApiModelProperty(value = "每页数据条数", example = "10", required = true)
    int pageSize;

    /**
     * 发起任务开始时间戳
     */
    @NotNull(message = "开始时间不能为空，没有就传0")
    @ApiModelProperty(value = "发起任务开始时间戳（精确到毫秒），时区为UTC，没有就传0", example = "1623148140000", required = false)
    Long startTime;

    /**
     * 发起任务结束时间戳
     */
    @NotNull(message = "结束时间不能为空，没有就传0")
    @ApiModelProperty(value = "发起任务结束时间戳（精确到毫秒），时区为UTC，没有就传0", example = "1624876140000", required = false)
    Long endTime;

    @ApiModelProperty(value = "任务状态 (0:所有状态 1:pending 2:running 3:failed 4:success)", required = false)
    Integer status;

    @ApiModelProperty(value = "在任务中角色(0:所有角色 1:创建者 2:算力提供者 3:数据提供者 4:结果接收者 5:算法提供者)", required = false)
    Integer role;
}

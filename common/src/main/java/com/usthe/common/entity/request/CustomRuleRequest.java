package com.usthe.common.entity.request;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CustomRuleRequest {

    /**
     * 指标名称
     */
    private String name;

    /**
     * 优先级
     */
    private Integer priority;

    /**
     * 具体监控指标
     */
    private List<MetricsFieldsRequest> fields;

    /**
     * 自定义计算规则(core:core1+core2)
     */
    private Map<String,String> calculationRule;

    /**
     * 采集协议
     */
    private Integer protocol;

    /**
     * 采集规则（host:127.0.0.1）
     */
    private Map<String,Object> protocolRule;
}

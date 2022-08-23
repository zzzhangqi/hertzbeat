package com.usthe.common.entity.request;

import lombok.Data;

@Data
public class MetricsFieldsRequest {

    /**
     * 字段名称
     */
    private String fieldName;

    /**
     * 字段类型
     */
    private Integer type;

    /**
     * 是否为主键
     */
    private Integer instance;

    /**
     * 单位
     */
    private String unit;

    /**
     * 别名
     */
    private String alias;
}

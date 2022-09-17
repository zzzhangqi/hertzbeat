package com.usthe.manager.pojo.vo;

import lombok.Data;

import java.util.Map;

/**
 * Created by lambert on 2022/8/26
 *
 * @author lambert
 * @date 2022/8/26
 */
@Data
public class CustomMonitorBasicVo {

    private Integer category;

    /**
     * app type
     */
    private String app;

    /**
     * name
     */
    private Map<String,Object> name;
}

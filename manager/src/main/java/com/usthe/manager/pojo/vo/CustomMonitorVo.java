package com.usthe.manager.pojo.vo;

import com.usthe.common.entity.request.CustomParamRequest;
import com.usthe.common.entity.request.CustomRuleRequest;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * custom monitor request
 * @author lambert
 * @date 23/8/2022
 */
@Data
public class CustomMonitorVo {


    private Integer category;

    /**
     * app type
     */
    private String app;

    /**
     * chinese name
     */
    private String chName;

    /**
     * english name
     */
    private String enName;

    /**
     * import custom param
     */
    private Map<String,Object> params;

    /**
     * param list
     */
    private List<CustomRuleRequest> TreasureMonitor;
}

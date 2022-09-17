package com.usthe.manager.pojo.vo;

import com.usthe.common.entity.job.Configmap;
import com.usthe.common.entity.job.Metrics;
import lombok.Data;

import java.util.List;

/**
 * custom monitor request
 * @author lambert
 * @date 23/8/2022
 */
@Data
public class CustomMonitorDefinedVo extends CustomMonitorBasicVo{

    /**
     * import custom param
     */
    private List<Configmap> configmap;

    /**
     * param list
     */
    private List<Metrics> metrics;
}

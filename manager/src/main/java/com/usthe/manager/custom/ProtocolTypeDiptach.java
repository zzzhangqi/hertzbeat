package com.usthe.manager.custom;

import com.usthe.common.entity.job.Metrics;

import java.util.Map;

/**
 * Created by za-jiangliwen on 2022/9/9
 *
 * @author za-jiangliwen
 * @date 2022/9/9
 */
public interface ProtocolTypeDiptach {

    /**
     * 进行验证区分
     */
    Map<String,Object> dispatch(Metrics request);
}

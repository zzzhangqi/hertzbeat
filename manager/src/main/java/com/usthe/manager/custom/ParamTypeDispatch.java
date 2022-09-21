package com.usthe.manager.custom;

import com.usthe.common.entity.manager.ParamDefine;

import java.util.Map;

/**
 * Created by za-jiangliwen on 2022/9/10
 *
 * @author za-jiangliwen
 * @date 2022/9/10
 */
public interface ParamTypeDispatch {

    /**
     * 对参数进行验证区分
     */
    Map<String,Object> dispatch(ParamDefine request);
}

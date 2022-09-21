/*
 * Copyright By ZATI
 * Copyright By 3a3c88295d37870dfd3b25056092d1a9209824b256c341f2cdc296437f671617
 * All rights reserved.
 *
 * If you are not the intended user, you are hereby notified that any use, disclosure, copying, printing, forwarding or
 * dissemination of this property is strictly prohibited. If you have got this file in error, delete it from your system.
 */
package com.usthe.manager.custom.param;

import com.usthe.common.annotation.ParamType;
import com.usthe.common.entity.manager.ParamDefine;
import com.usthe.manager.custom.ParamTypeDispatch;

import java.util.Map;

/**
 * Created by za-jiangliwen on 2022/9/17
 *
 * @author za-jiangliwen
 * @date 2022/9/17
 */
@ParamType(name = "key-value")
public class KeyValueParamImpl implements ParamTypeDispatch {
    @Override
    public Map<String, Object> dispatch(ParamDefine request) {
        return null;
    }
}

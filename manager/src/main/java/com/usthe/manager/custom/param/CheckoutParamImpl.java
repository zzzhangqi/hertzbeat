package com.usthe.manager.custom.param;

import com.usthe.common.annotation.ParamType;
import com.usthe.common.entity.manager.ParamDefine;
import com.usthe.manager.custom.ParamTypeDispatch;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by za-jiangliwen on 2022/9/10
 *
 * @author za-jiangliwen
 * @date 2022/9/10
 */
@ParamType(name = "checkout")
public class CheckoutParamImpl implements ParamTypeDispatch {
    @Override
    public Map<String, Object> dispatch(ParamDefine request) {
        Map<String,Object> map = new HashMap<>(8);
        map.put("type","checkout");
        map.put("options",request.getOptions());
        return map;
    }
}

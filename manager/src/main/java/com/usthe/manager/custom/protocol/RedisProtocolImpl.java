package com.usthe.manager.custom.protocol;

import com.usthe.common.annotation.ProtocolType;
import com.usthe.common.entity.job.Metrics;
import com.usthe.common.entity.job.protocol.RedisProtocol;
import com.usthe.common.util.JacksonUtil;
import com.usthe.manager.custom.ProtocolTypeDiptach;

import java.util.Map;

/**
 * Created by za-jiangliwen on 2022/9/9
 *
 * @author za-jiangliwen
 * @date 2022/9/9
 */
@ProtocolType(name = "redis")
public class RedisProtocolImpl implements ProtocolTypeDiptach {
    @Override
    public Map<String, Object> dispatch(Metrics request) {
        JacksonUtil<RedisProtocol> jacksonUtil = new JacksonUtil<>();
        return jacksonUtil.readValue(request.getRedis());
    }
}

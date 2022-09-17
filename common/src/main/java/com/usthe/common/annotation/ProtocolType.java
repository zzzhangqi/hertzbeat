package com.usthe.common.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by za-jiangliwen on 2022/9/9
 *
 * @author za-jiangliwen
 * @date 2022/9/9
 */
@Component
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ProtocolType {
    String name();
}

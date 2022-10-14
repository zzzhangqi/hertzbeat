package com.usthe.common.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

/**
 * Created by za-jiangliwen on 2022/9/6
 *
 * @author za-jiangliwen
 * @date 2022/9/6
 */
public class JacksonUtil<T> {

    public Map readValue(T t){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(objectMapper.writeValueAsString(t), Map.class);
        }catch(Exception e){
            throw new RuntimeException("conversion error");
        }
    }

    public String toString(T t){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(t);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("conversion error");
        }
    }

    public Object toClass(String val,Class clazz){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(val, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("conversion error");
        }
    }
}

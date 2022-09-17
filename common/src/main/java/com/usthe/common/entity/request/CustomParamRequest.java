package com.usthe.common.entity.request;

import lombok.Data;

import java.util.Map;

/**
 * the custom monitor param config request
 *
 * @author lambert
 * @date 23/8/2022
 */
@Data
public class CustomParamRequest {

    /**
     * field flag
     */
    private String field;

    /**
     * name
     */
    private Map<String,Object> name;

    /**
     * field type(like the type attribute of the input label)
     */
    private String type;

    /**
     * is required
     */
    private Boolean required;

    private String defaultValue;

    /**
     * field type(like the type attribute of the input label)
     */
    private String placeholder;

    /**
     * when type is number,this field will take effect
     */
    private String range;

    /**
     * when type is text,this field will take effect
     * limit words
     */
    private Integer limit;

    /**
     * when type is radio or checkbox,this field will take effect
     */
    private Map<String,Object> options;
}

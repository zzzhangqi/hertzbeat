package com.usthe.manager.pojo.vo;

import com.usthe.common.entity.manager.ParamDefine;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;


/**
 * request param
 * @author lamert
 * @date 23/8/2022
 */
@Data
@ApiModel(description = "custom monitor param request")
public class CustomMonitorParamVo extends CustomMonitorBasicVo{

    /**
     * param list
     */
    private List<ParamDefine> params;

}

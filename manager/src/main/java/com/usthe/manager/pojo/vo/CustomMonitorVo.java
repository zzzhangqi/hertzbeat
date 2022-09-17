package com.usthe.manager.pojo.vo;

import lombok.Data;

/**
 * Created by lambert on 2022/9/6
 *
 * @author lambert
 * @date 2022/9/6
 */
@Data
public class CustomMonitorVo extends CustomMonitorBasicVo{

    private CustomMonitorDefinedVo customMonitorDefinedVo;

    private CustomMonitorParamVo customMonitorParamVo;

    public void setBaseInfo(CustomMonitorBasicVo customMonitorBasicVo){
        this.setCategory(customMonitorBasicVo.getCategory());
        this.setApp(customMonitorBasicVo.getApp());
        this.setName(customMonitorBasicVo.getName());
    }
}

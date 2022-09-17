package com.usthe.manager.controller;

import com.usthe.common.entity.dto.Message;
import com.usthe.common.entity.request.BasePageRequest;
import com.usthe.manager.pojo.vo.CustomMonitorBasicVo;
import com.usthe.manager.pojo.vo.CustomMonitorParamVo;
import com.usthe.manager.pojo.vo.CustomMonitorDefinedVo;
import com.usthe.manager.pojo.vo.CustomMonitorVo;
import com.usthe.manager.service.AppService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Created by lambert on 2022/8/24
 *
 * @author lambert
 * @date 2022/8/24
 */
@RestController
@Api(tags = "Custom Monitor Manage API | 自定义监控管理API")
@RequestMapping(path = "/api/custom/monitors", produces = {APPLICATION_JSON_VALUE})
public class CustomMonitorController {

    @Autowired
    private AppService appService;

    /**
     * save custom monitor basic info
     * 保存自定义监控基本信息
     * @return ResponseEntity
     */
    @PostMapping("/saveBasicInfo")
    @ApiOperation(value = "Add a custom monitoring basic information", notes = "新增自定义监控基本信息")
    public ResponseEntity<Message<Void>> setCustomMonitorBasicInfo(@RequestBody CustomMonitorBasicVo customMonitorBasicVo){
        CustomMonitorVo customMonitorVo = new CustomMonitorVo();
        customMonitorVo.setBaseInfo(customMonitorBasicVo);
        appService.setCustomInfo(customMonitorVo);
        return ResponseEntity.ok(new Message<>());
    }

    /**
     * save custom monitor param info
     * 保存自定义监控参数信息
     * @return ResponseEntity
     */
    @PostMapping("/saveParamInfo")
    @ApiOperation(value = "Add a custom monitoring param information", notes = "新增自定义监控参数信息")
    public ResponseEntity<Message<Void>> setCustomMonitorParamInfo(@RequestBody CustomMonitorParamVo customMonitorParamVo){
        appService.setCustomParamInfo(customMonitorParamVo);
        return ResponseEntity.ok(new Message<>());
    }

    /**
     * save custom monitor defined info
     * 保存自定义监控定义信息
     * @return ResponseEntity
     */
    @PostMapping("/saveDefinedInfo")
    @ApiOperation(value = "Add a custom monitoring defined information", notes = "新增自定义监控定义信息")
    public ResponseEntity<Message<Void>> setCustomMonitorDefinedInfo(@RequestBody CustomMonitorDefinedVo customMonitorDefinedVo){
        appService.setCustomDefinedInfo(customMonitorDefinedVo);
        return ResponseEntity.ok(new Message<>());
    }

    /**
     * select all custom monitor info
     * 查询所有自定义监控信息
     * @return
     */
    @GetMapping("/")
    @ApiOperation(value = "select all custom monitor info", notes = "获取所有自定义信息")
    public ResponseEntity<List<CustomMonitorVo>> getAllCustomInfo(BasePageRequest basePageRequest){
        appService.getAllCustomInfo(basePageRequest);
        return null;
    }

    /**
     * select one custom monitor info
     * 获取自定义监控信息
     */
    @GetMapping("/{app}")
    @ApiOperation(value = "select all custom monitor info", notes = "获取所有自定义信息")
    public ResponseEntity<CustomMonitorVo> getOneCustomInfo(@PathVariable("app") String app){
        appService.getOneCustomInfo(app);
        return null;
    }

    /**
     * update custom monitor info
     * 更新自定义监控信息
     * @param customMonitorVo
     */
    @PutMapping("/")
    @ApiOperation(value = "update custom monitor info", notes = "更新自定义信息")
    public ResponseEntity<Message<Void>> updateCustomInfo(@RequestBody CustomMonitorVo customMonitorVo){
        appService.updateCustomInfo(customMonitorVo);
        return null;
    }
}

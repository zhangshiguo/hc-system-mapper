package com.hc.system.controller;

import com.hc.system.entity.Area;
import com.hc.system.service.AreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 创建人是: zsg 创建时间: 2018/2/7 0007.
 */
@Api(description = "模块描述")
@RestController
@RequestMapping("/manage")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @ApiOperation(value="方法简要说明", notes="方法详细说明")
    @ApiImplicitParam(name = "user",value = "用户信息 包含手机号码",required = true,dataType = "User")
    @GetMapping("/list_area")
    public Map<String, Object> listArea() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Area> list = areaService.getAreaList();
        modelMap.put("areaList", list);
        return modelMap;
    }
    @ApiOperation(value="根据id查找区域", notes="根据id查找区域详细介绍")
//    @ApiImplicitParams(value = {
//            @ApiImplicitParam(name = "school", value = "学校名称", required = true, paramType = "query", dataType = "String"),
//            @ApiImplicitParam(name = "name", value = "姓名", required = true, paramType = "query", dataType = "String")
//    })
    @GetMapping("/getareabyid")
    public Map<String, Object> getAreaById(Integer areaId) {
        Map<String, Object> modelMap = new HashMap<>();
        Area area = areaService.getAreaById(areaId);
        modelMap.put("area", area);
        return modelMap;
    }

    @PostMapping("/addarea")
    public Map<String, Object> addArea(@RequestBody Area area) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", areaService.addArea(area));
        return modelMap;
    }

    @PostMapping("/modifyarea")
    public Map<String, Object> modifyArea(@RequestBody Area area) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", areaService.modifyArea(area));
        return modelMap;
    }

    @GetMapping("/removearea")
    public Map<String, Object> removeArea(Integer areaId) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", areaService.deleteArea(areaId));
        return modelMap;
    }
}

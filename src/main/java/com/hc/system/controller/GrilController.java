package com.hc.system.controller;

import com.hc.system.entity.Gril;
import com.hc.system.service.GrilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 创建人是: zsg 创建时间: 2018/2/7 0007.
 */
@RestController
@RequestMapping("/gril")
public class GrilController {
    @Autowired
    private GrilService grilService;

    @GetMapping("/grils")
    public Map<String, Object> list() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Gril> list = grilService.queryGrilList();
        modelMap.put("list", list);
        return modelMap;
    }

//    @GetMapping("/getareabyid")
//    public Map<String, Object> getAreaById(Integer areaId) {
//        Map<String, Object> modelMap = new HashMap<>();
//        Area area = g.getAreaById(areaId);
//        modelMap.put("area", area);
//        return modelMap;
//    }

//    @PostMapping("/addarea")
//    public Map<String, Object> addArea(@RequestBody Area area) {
//        Map<String, Object> modelMap = new HashMap<>();
//        modelMap.put("success", areaService.addArea(area));
//        return modelMap;
//    }
//
//    @PostMapping("/modifyarea")
//    public Map<String, Object> modifyArea(@RequestBody Area area) {
//        Map<String, Object> modelMap = new HashMap<>();
//        modelMap.put("success", areaService.modifyArea(area));
//        return modelMap;
//    }
//
//    @GetMapping("/removearea")
//    public Map<String, Object> removeArea(Integer areaId) {
//        Map<String, Object> modelMap = new HashMap<>();
//        modelMap.put("success", areaService.deleteArea(areaId));
//        return modelMap;
//    }
}

package com.hc.system.service;


import com.hc.system.entity.Area;

import java.util.List;

/**
 * 创建人是: zsg 创建时间: 2018/2/7 0007.
 */
public interface AreaService {
    List<Area> getAreaList();

    Area getAreaById(int areaId);

    boolean addArea(Area area);

    boolean modifyArea(Area area);

    boolean deleteArea(int areaId);
}

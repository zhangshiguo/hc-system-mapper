package com.hc.system.dao;


import com.hc.system.entity.Area;

import java.util.List;

/**
 * 创建人是: zsg 创建时间: 2018/2/7 0007.
 */
public interface AreaDao {
    List<Area> queryArea();

    Area queryAreaById(int areaId);

    int insertArea(Area area);

    int updateArea(Area area);

    int deleteArea(int areaId);
}

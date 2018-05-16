package com.hc.system.service.impl;

import com.hc.system.common.ResponseCode;
import com.hc.system.dao.AreaDao;
import com.hc.system.dao.LearnResourceMapper;
import com.hc.system.entity.Area;
import com.hc.system.entity.LearnResource;
import com.hc.system.exception.AreaException;
import com.hc.system.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * 创建人是: zsg 创建时间: 2018/2/7 0007.
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;

    @Autowired
    private LearnResourceMapper learnResourceMapper;

    @Override
    public List<Area> getAreaList() {
//        try{
//            int a = 1/0;
//        }catch (Exception e){
//            throw new RuntimeException("name不能为空");
//        }
        return areaDao.queryArea();
    }

    @Override
    public Area getAreaById(int areaId) {
        int a = 1 / 0;
        return areaDao.queryAreaById(areaId);
    }


    @Override
    @Transactional
    public boolean addArea(Area area) {

        if (area.getAreaName() != null && !"".equals(area.getAreaName())) {
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int resultCount = areaDao.insertArea(area);
                if (resultCount > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入失败" + e.toString());
            }
        } else {
            throw new RuntimeException("name不能为空");
        }
    }

    @Override
    public boolean modifyArea(Area area) {
        if (area.getAreaId() != null && area.getAreaId() > 0) {
            area.setLastEditTime(new Date());
            try {
                int resultCount = areaDao.updateArea(area);
                if (resultCount > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新失败" + e.toString());
            }
        } else {
            throw new RuntimeException("id不能为空");
        }
    }

    @Override
    public boolean deleteArea(int areaId) {
        if (areaId > 0) {
            try {
                int resultCount = areaDao.deleteArea(areaId);
                if (resultCount > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除失败" + e.toString());
            }
        } else {
            throw new RuntimeException("id不能为空");
        }
    }
}

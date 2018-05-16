package com.hc.system.service.impl;

import com.hc.system.dao.GrilMapper;
import com.hc.system.entity.Gril;
import com.hc.system.service.GrilService;
import com.hc.system.service.common.impl.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 创建人是: zsg 创建时间: 2018/3/27 0027.
 */
@Service
public class GrilServiceImpl extends BaseService<Gril> implements GrilService {

    @Autowired
    private GrilMapper grilMapper;

    @Override
    public List<Gril> queryGrilList() {
        return grilMapper.queryGrilList();
        //return grilMapper.selectAll();
    }

}

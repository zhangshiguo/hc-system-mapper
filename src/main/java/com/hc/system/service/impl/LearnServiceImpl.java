package com.hc.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hc.system.common.ResponseCode;
import com.hc.system.dao.LearnResourceMapper;
import com.hc.system.entity.LearnResource;
import com.hc.system.exception.AreaException;
import com.hc.system.service.LearnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 创建人是: zsg 创建时间: 2018/3/1 0001.
 */
@Service
public class LearnServiceImpl implements LearnService {
    @Autowired
    private LearnResourceMapper learnResourceMapper;

    @Override
    public PageInfo queryLearnResouceList(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<LearnResource> list = learnResourceMapper.selectAll();
        PageInfo<LearnResource> pageResult = new PageInfo<>(list);
        return pageResult;
    }
}

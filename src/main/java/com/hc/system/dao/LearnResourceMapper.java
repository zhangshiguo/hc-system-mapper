package com.hc.system.dao;

import com.hc.system.entity.LearnResource;
import java.util.List;

public interface LearnResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LearnResource record);

    LearnResource selectByPrimaryKey(Integer id);

    List<LearnResource> selectAll();

    int updateByPrimaryKey(LearnResource record);
}
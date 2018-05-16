package com.hc.system.dao;

import com.hc.system.entity.Gril;
import com.hc.system.util.MyMapper;

import java.util.List;

public interface GrilMapper extends MyMapper<Gril> {
    List<Gril> queryGrilList();
}
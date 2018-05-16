package com.hc.system.service;

import com.hc.system.entity.Gril;
import com.hc.system.service.common.IService;

import java.util.List;

/**
 * 创建人是: zsg 创建时间: 2018/3/27 0027.
 */
public interface GrilService extends IService<Gril> {
    List<Gril> queryGrilList();
}

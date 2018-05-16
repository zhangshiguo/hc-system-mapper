package com.hc.system.service.common;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 创建人是: zsg 创建时间: 2018/3/27 0027.
 * 通用接口
 */
@Service
public interface IService<T> {

    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);

    //TODO 其他...
}

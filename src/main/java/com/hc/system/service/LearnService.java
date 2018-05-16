package com.hc.system.service;

        import com.github.pagehelper.PageInfo;

/**
 * 创建人是: zsg 创建时间: 2018/3/1 0001.
 */
public interface LearnService {
    public PageInfo queryLearnResouceList(int pageNum,int pageSize);
}

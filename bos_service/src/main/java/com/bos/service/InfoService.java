package com.bos.service;

import com.bos.pojo.Info;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface InfoService {
    /**
     * 发布货源信息
     * @param info
     * @return
     */
    public int addInfo(Info info);

    /**
     * 查询货源信息列表
     * @return
     */
    public List<Info> findAllInfo();
}

package com.bos.service;

import com.bos.pojo.NewInfo;
import com.github.pagehelper.PageInfo;

import javax.servlet.http.HttpSession;
import java.util.Map;

public interface NewInfoService {
    public PageInfo<NewInfo> getAllNewInfo(Integer pageNo, Map<String, Object> paramMap, HttpSession session);

    public int access(NewInfo newInfo);

    public PageInfo<NewInfo> adminGetAllNewInfo(Integer pageNo,Integer pageSize, Map<String, Object> paramMap, HttpSession session);
}

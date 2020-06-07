package com.bos.service;

import com.bos.pojo.Type;

import java.util.List;

public interface TypeService {
    /**
     * 根据父id查询类型
     * @param pid
     * @return
     */
    public List<Type> getTypeByPid(Long pid);

    /**
     * 查询所有的种类
     * @return
     */
    public String[] findTypeArray();

    public int addType(Type type);

    public Type findOne(Long id);

    public int updateType(Type type);

    public void delete(Long[] ids);
}

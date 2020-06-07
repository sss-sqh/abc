package com.bos.service.impl;

import com.bos.dao.TypeMapper;
import com.bos.pojo.Type;
import com.bos.pojo.TypeExample;
import com.bos.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    /**
     * 根据父id查询类型
     * @param pid
     * @return
     */
    @Override
    public List<Type> getTypeByPid(Long pid) {
        TypeExample example = new TypeExample();
        TypeExample.Criteria criteria = example.createCriteria();
        criteria.andPidEqualTo(pid);
        return typeMapper.selectByExample(example);
    }

    /**
     * 查询所有的种类
     * @return
     */
    @Override
    public String[] findTypeArray() {
        //从数据库中查询出type类型列表的所有数据
        List<Type> typeList = typeMapper.selectByExample(null);
        //创建一个大小比所以数据多一的一个字符串数组
//        String[] typeArray = new String[typeList.size()+1];
        String[] typeArray = new String[100];
        //循环遍历将type类型的数据存入到数组中。
        for (Type type:typeList) {
            //保存的时候，以id为下标，以name为数组的值
            typeArray[type.getId().intValue()] = type.getName();
        }
        return typeArray;
    }

    @Override
    public int addType(Type type) {
        return typeMapper.insert(type);
    }

    @Override
    public Type findOne(Long id) {
        return typeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateType(Type type) {
        return typeMapper.updateByPrimaryKeySelective(type);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id:ids) {
            typeMapper.deleteByPrimaryKey(id);
        }
    }
}

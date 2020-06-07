package com.bos.service.impl;

import com.bos.dao.InfoMapper;
import com.bos.pojo.Info;
import com.bos.pojo.InfoExample;
import com.bos.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    private InfoMapper infoMapper;

    /**
     * 发布货源信息
     * @param info
     * @return
     */
    @Override
    public int addInfo(Info info) {
        //货源信息创建时间
        info.setCreatedTime(new Date());
        //货源信息修改时间
        info.setUpdatedTime(new Date());
        //设置货源信息为货源信息状态
        info.setIstatus(0);
        //如果没有运价则默认设置为面议
        if(info.getIcost() == null || info.getIcost() == ""){
            info.setIcost("面议");
        }
        return infoMapper.insert(info);
    }

    /**
     * 查询货源信息列表
     * @return
     */
    @Override
    public List<Info> findAllInfo(){
        InfoExample example = new InfoExample();
        InfoExample.Criteria criteria = example.createCriteria();
        criteria.andIstatusEqualTo(0);
        List<Info> infoList = infoMapper.selectByExample(example);
        return  infoList;
    }
}

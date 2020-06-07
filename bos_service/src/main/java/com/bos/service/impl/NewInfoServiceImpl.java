package com.bos.service.impl;

import com.bos.dao.InfoMapper;
import com.bos.pojo.Info;
import com.bos.pojo.InfoExample;
import com.bos.pojo.NewInfo;
import com.bos.pojo.User;
import com.bos.service.AddressService;
import com.bos.service.NewInfoService;
import com.bos.service.TypeService;
import com.bos.utils.ConstantUtils;
import com.bos.utils.MapUtils;
import com.bos.utils.TimeUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.bos.utils.PageUtils.PageInfo2PageInfoVo;

@Service
public class NewInfoServiceImpl implements NewInfoService {

    @Autowired
    private InfoMapper infoMapper;

    @Autowired
    private AddressService addressService;

    @Autowired
    private TypeService typeService;

    public PageInfo<NewInfo> getAllNewInfo(Integer pageNo,
                                           Map<String, Object> paramMap,
                                           HttpSession session){

        //从info表中查询到对应的数据
        InfoExample example = new InfoExample();
        InfoExample.Criteria criteria = example.createCriteria();
        criteria.andIstatusEqualTo(3);
        Object sprovince =  paramMap.get("sprovince");
        if(sprovince != null && sprovince != ""){
            Long sprovinceId= Long.valueOf(sprovince.toString());
            if(sprovinceId != 0){
                criteria.andSprovinceEqualTo(sprovinceId);
            }
        }

        Object scity =  paramMap.get("scity");
        if(scity != null && scity != ""){
            Long scityId= Long.valueOf(scity.toString());
            if(scityId != 0){
                criteria.andScityEqualTo(scityId);
            }
        }

        Object scounty =  paramMap.get("scounty");
        if(scounty != null && scounty != ""){
            Long scountyId= Long.valueOf(scounty.toString());
            if(scountyId != 0){
                criteria.andScountyEqualTo(scountyId);
            }
        }

        //分页查询信息
        PageHelper.startPage(pageNo, ConstantUtils.PAGE_SIZE);

        List<Info> infoList = infoMapper.selectByExample(example);

        //把查询到的数据放入到PageInfo中
        PageInfo<Info> pageInfo1 = new PageInfo<Info>(infoList,ConstantUtils.NAVIGATE_PAGENUM);
        System.out.println(pageInfo1.getTotal());
        //将pageInfo1中的所有数据存入到自己创建的MyPageInfo中
        PageInfo<NewInfo> newPageInfo = PageInfo2PageInfoVo(pageInfo1);

        //获取PageInfo中的数据
//        List<Info> pageInfoList = pageInfo1.getList();


        //创建一个数组用来保存所有的地址数据
        String[] addressArray = addressService.findAddressArray();
        //创建一个数组用来保存所有的类型数据
        String[] typeArray = typeService.findTypeArray();

        List<NewInfo> newInfoList = comAddressAndType(infoList, addressArray, typeArray);

//        PageInfo<NewInfo> pageInfo = new PageInfo<NewInfo>(newInfoList,ConstantUtils.NAVIGATE_PAGENUM);
        newPageInfo.setList(newInfoList);
        return  newPageInfo;
    }



    //组合地址和类型方法
    public static List<NewInfo> comAddressAndType(List<Info> infoList,String[] addressArray,String[] typeArray){
        //创建一个新的List集合用来存放新的信息 拼接的字符串和类型等信息
        List<NewInfo> newInfoList = new ArrayList<>();
        for (Info info:infoList) {
            NewInfo newInfo = new NewInfo();
            newInfo.setInfo(info);
            String sprovince = "";
            String scity = "";
            String scounty = "";
            String dprovince = "";
            String dcity = "";
            String dcounty = "";
            String typeGood1 = "";
            String typeGood2 = "";
            //首先将Long类型转换为Int类型
            if(info.getSprovince() != null){
                sprovince = addressArray[info.getSprovince().intValue()];
            }
            if(info.getScity() != null){
                scity = addressArray[info.getScity().intValue()];
            }
            if(info.getScounty() != null){
                scounty = addressArray[info.getScounty().intValue()];
            }
            if(info.getDprovince() != null){
                dprovince = addressArray[info.getDprovince().intValue()];
            }
            if(info.getDcity() != null){
                dcity = addressArray[info.getDcity().intValue()];
            }
            if(info.getDcounty() != null){
                dcounty = addressArray[info.getDcounty().intValue()];
            }
            if(info.getTypeGood1() != null){
                typeGood1 = typeArray[info.getTypeGood1().intValue()];
            }
            if(info.getTypeGood2() != null){
                typeGood2 = typeArray[info.getTypeGood2().intValue()];
            }
            String address = sprovince +" "+ scity +" "+ scounty +"→"+ dprovince +" "+ dcity +" "+ dcounty;
            String type = typeGood1 +"-"+typeGood2;
            newInfo.setAddress(address);
            newInfo.setType(type);
            newInfoList.add(newInfo);
        }
        return  newInfoList;
    }

    @Override
    public int access(NewInfo newInfo) {
        Long iid = newInfo.getInfo().getIid();
        Info info = new Info();
        info.setIid(iid);
        info.setCreatedTime(TimeUtils.stringDate2Date(newInfo.getInfo().getCreatedTime()));
        info.setUpdatedTime(TimeUtils.stringDate2Date(newInfo.getInfo().getUpdatedTime()));
        info.setIstatus(3);
        return infoMapper.updateByPrimaryKeySelective(info);
    }


    public PageInfo<NewInfo> adminGetAllNewInfo(Integer pageNo,Integer pageSize,
                                           Map<String, Object> paramMap,
                                           HttpSession session){

        //从info表中查询到对应的数据
        InfoExample example = new InfoExample();
        InfoExample.Criteria criteria = example.createCriteria();
        criteria.andIstatusEqualTo(0);
        Object sprovince =  paramMap.get("sprovince");
        if(sprovince != null && sprovince != ""){
            Long sprovinceId= Long.valueOf(sprovince.toString());
            if(sprovinceId != 0){
                criteria.andSprovinceEqualTo(sprovinceId);
            }
        }

        Object scity =  paramMap.get("scity");
        if(scity != null && scity != ""){
            Long scityId= Long.valueOf(scity.toString());
            if(scityId != 0){
                criteria.andScityEqualTo(scityId);
            }
        }

        Object scounty =  paramMap.get("scounty");
        if(scounty != null && scounty != ""){
            Long scountyId= Long.valueOf(scounty.toString());
            if(scountyId != 0){
                criteria.andScountyEqualTo(scountyId);
            }
        }

        //分页查询信息
        PageHelper.startPage(pageNo, ConstantUtils.PAGE_SIZE);

        List<Info> infoList = infoMapper.selectByExample(example);

        //把查询到的数据放入到PageInfo中
        PageInfo<Info> pageInfo1 = new PageInfo<Info>(infoList,ConstantUtils.NAVIGATE_PAGENUM);
        System.out.println(pageInfo1.getTotal());
        //将pageInfo1中的所有数据存入到自己创建的MyPageInfo中
        PageInfo<NewInfo> newPageInfo = PageInfo2PageInfoVo(pageInfo1);

        //获取PageInfo中的数据
//        List<Info> pageInfoList = pageInfo1.getList();


        //创建一个数组用来保存所有的地址数据
        String[] addressArray = addressService.findAddressArray();
        //创建一个数组用来保存所有的类型数据
        String[] typeArray = typeService.findTypeArray();

        List<NewInfo> newInfoList = comAddressAndType(infoList, addressArray, typeArray);

//        PageInfo<NewInfo> pageInfo = new PageInfo<NewInfo>(newInfoList,ConstantUtils.NAVIGATE_PAGENUM);
        newPageInfo.setList(newInfoList);
        return  newPageInfo;
    }

}

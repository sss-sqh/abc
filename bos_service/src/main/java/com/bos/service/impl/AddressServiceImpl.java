package com.bos.service.impl;

import com.bos.dao.AddressMapper;
import com.bos.pojo.Address;
import com.bos.pojo.AddressExample;
import com.bos.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    //注入AddressMapper对象
    @Autowired
    private AddressMapper addressMapper;

    /**
     * 获取address对象，根据pid
     * @param pid
     * @return
     */
    @Override
    public List<Address> getAddByPid(Long pid) {
        AddressExample example = new AddressExample();
        AddressExample.Criteria criteria = example.createCriteria();
        criteria.andPidEqualTo(pid);
        List<Address> addressList = addressMapper.selectByExample(example);
        return addressList;
    }

    /**
     * 查询所有的地址信息
     * @return
     */
    @Override
    public String[] findAddressArray() {
        List<Address> addressList = addressMapper.selectByExample(null);
        //创建一个和集合一样大的数据
        String[] addrArray = new String[addressList.size()+1];
        for (Address addr:addressList) {
            addrArray[addr.getId().intValue()] = addr.getAddr();
        }
//        System.out.println(addrArray.toString());
        return addrArray;
    }

    /**
     * 查询所有的地址信息
     * @return
     */
    @Override
    public List<Address> findAddressList() {
        return addressMapper.selectByExample(null);
    }
}

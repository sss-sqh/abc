package com.bos.service;

import com.bos.pojo.Address;

import java.util.List;

public interface AddressService {
    /**
     * 获取address对象，根据pid
     * @param pid
     * @return
     */
    public List<Address> getAddByPid(Long pid);

    /**
     * 查询所有的地址信息
     * @return
     */
    public String[] findAddressArray();

    /**
     * 查询所有的地址信息
     * @return
     */
    public List<Address> findAddressList();
}

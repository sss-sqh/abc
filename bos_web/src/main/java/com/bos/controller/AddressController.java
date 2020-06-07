package com.bos.controller;

import com.bos.pojo.Address;
import com.bos.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    /**
     * 获取address对象，根据pid
     * @param pid
     * @return
     */
    @RequestMapping("/getAddByPid")
    public List<Address> getAddByPid(Long pid){
        return addressService.getAddByPid(pid);
    }
}

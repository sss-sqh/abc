package com.bos.controller;

import com.bos.pojo.Info;
import com.bos.pojo.NewInfo;
import com.bos.service.AddressService;
import com.bos.service.InfoService;
import com.bos.service.NewInfoService;
import com.bos.service.TypeService;
import com.bos.utils.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/newInfo")
public class NewInfoController {

    @Autowired
    private NewInfoService newInfoService;

    @RequestMapping("/getAllNewInfo")
    public PageInfo<NewInfo> getAllNewInfo(@RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo,
                                           @RequestParam(value = "pageSize",defaultValue = "4") Integer pageSize,
                                           HttpServletRequest request,
                                           HttpSession session){
        Map<String, Object> paramMap = WebUtils.getParametersStartingWith(request, "search_");
        PageInfo<NewInfo> page = newInfoService.getAllNewInfo(pageNo,paramMap,session);
        return page;
    }

    @RequestMapping("access")
    public Result access(@RequestBody NewInfo newInfo){
        if(newInfoService.access(newInfo) > 0){
            return new Result(true,"审核成功！");
        }else {
            return new Result(false,"审核失败！");
        }
    }

    @RequestMapping("/adminGetAllNewInfo")
    public PageInfo<NewInfo> adminGetAllNewInfo(@RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo,
                                           @RequestParam(value = "pageSize",defaultValue = "4") Integer pageSize,
                                           HttpServletRequest request,
                                           HttpSession session){
        Map<String, Object> paramMap = WebUtils.getParametersStartingWith(request, "search_");
        PageInfo<NewInfo> page = newInfoService.adminGetAllNewInfo(pageNo,pageSize,paramMap,session);
        return page;
    }
}

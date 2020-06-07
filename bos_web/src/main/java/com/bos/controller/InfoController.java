package com.bos.controller;

import com.bos.pojo.Info;
import com.bos.pojo.User;
import com.bos.service.AddressService;
import com.bos.service.InfoService;
import com.bos.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;


    @RequestMapping("/add")
    public Result addInfo(@RequestBody Info info, HttpSession session){
        //设置关联发布信息的货主id 应该是不能为空
        User loginUser = (User)session.getAttribute("loginUser");
        info.setIuserId(loginUser.getId());
        if (infoService.addInfo(info) > 0) {
            return new Result(true,"发布成功！");
        }else {
            return new Result(false,"发布失败！");
        }
    }

    /**
     * 查询货源信息列表
     * @return
     */
    @RequestMapping("/findAllInfo")
    public List<Info> findAllInfo(){
        return infoService.findAllInfo();
    }

}

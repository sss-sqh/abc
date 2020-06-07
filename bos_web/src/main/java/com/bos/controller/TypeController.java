package com.bos.controller;

import com.bos.pojo.Type;
import com.bos.service.TypeService;
import com.bos.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/type")
public class TypeController {
    @Autowired
    private TypeService typeService;

    /**
     * 根据父id查询类型
     * @param pid
     * @return
     */
    @RequestMapping("/getTypeByPid")
    public List<Type> getTypeByPid(Long pid){
        return typeService.getTypeByPid(pid);
    }

    @RequestMapping("/addType")
    public Result addType(@RequestBody Type type){
        if(typeService.addType(type) > 0){
            return new Result(true,"添加成功！");
        }else {
            return new Result(false,"添加失败！");
        }
    }

    @RequestMapping("/updateType")
    public Result updateType(@RequestBody Type type){
        if(typeService.updateType(type) > 0){
            return new Result(true,"添加成功！");
        }else {
            return new Result(false,"添加失败！");
        }
    }

    @RequestMapping("/delete")
    public Result delete(Long[] ids){
        try {
            typeService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    @RequestMapping("/findOne")
    public Type findOne(Long id){
        return typeService.findOne(id);
    }
}

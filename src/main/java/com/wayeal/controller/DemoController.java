package com.wayeal.controller;

import com.wayeal.pojo.User;
import com.wayeal.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @Author: tyf
 * @Date: 2022/06/14/17:56
 * @Description:
 */

@RestController
public class DemoController {

    @Resource
    private UserService userService;

    @RequestMapping("/save")
    public String save(User user) {
        userService.save(user);
        return "保存成功";
    }

    @RequestMapping("/findAll")
    public Object findAll() {
        return userService.findAll();
    }

    @RequestMapping("/delete")
    public String delete(Integer id) {
        userService.delete(id);
        return "删除成功";
    }

}

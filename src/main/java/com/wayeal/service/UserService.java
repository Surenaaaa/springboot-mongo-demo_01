package com.wayeal.service;

import com.wayeal.mapper.UserMappr;
import com.wayeal.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @Author: tyf
 * @Date: 2022/06/14/17:49
 * @Description:
 */

@Service
public class UserService {
//qqqqqqqqqqq
    @Resource
    private UserMappr userMappr;

    public void save(User user){
        userMappr.save(user);
    }

    public List<User> findAll(){
        return userMappr.findAll();
    }

    public void delete(Integer id){
        userMappr.deleteById(id);
    }
}

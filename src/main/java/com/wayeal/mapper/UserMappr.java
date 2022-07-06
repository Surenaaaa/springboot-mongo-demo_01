package com.wayeal.mapper;

import com.wayeal.pojo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @version 1.0
 * @Author: tyf
 * @Date: 2022/06/14/17:45
 * @Description:
 */
public interface UserMappr extends MongoRepository<User, Integer> {
}

package com.cxl.quick.api.service;


import com.cxl.quick.api.entity.User;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description TODO
 * @Auther cxl
 * @Date 2021/10/27 7:44 下午
 * @Version 1.0.0
 **/
@Service
public class UserService {


    public User findUserById(String userId) {
        if("1".equals(userId)){
            return new User("1","admin","123456");
        }else{
            return null;
        }

    }

    public User findByUsername(User user) {
        if("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())){
            return new User("1","admin","123456");
        }else{
            return null;
        }
    }
}

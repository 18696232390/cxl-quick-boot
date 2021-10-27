package com.cxl.quick.api.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.cxl.quick.api.entity.User;
import org.springframework.stereotype.Service;

/**
 * @ClassName TokenService
 * @Description TODO
 * @Auther cxl
 * @Date 2021/10/27 7:46 下午
 * @Version 1.0.0
 **/
@Service
public class TokenService {

    public String getToken(User user) {
        String token="";
        token= JWT.create().withAudience(user.getId())
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }

}

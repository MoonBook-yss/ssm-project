package com.yss.ssm.service;

import com.yss.ssm.domin.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUsersService extends UserDetailsService {


    List<UserInfo> findAll() throws Exception;

    void save(UserInfo userInfo);

    UserInfo findById(String id);
}

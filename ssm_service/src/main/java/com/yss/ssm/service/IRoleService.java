package com.yss.ssm.service;



import com.yss.ssm.domin.Role;

import java.util.List;

public interface IRoleService {

    public List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;
}

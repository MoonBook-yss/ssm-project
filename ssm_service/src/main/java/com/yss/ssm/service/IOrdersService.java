package com.yss.ssm.service;

import com.yss.ssm.domin.Orders;

public interface IOrdersService {
    void save(Orders orders);

    Orders findById(String id) throws Exception;
}

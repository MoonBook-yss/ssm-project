package com.yss.ssm.service.impl;

import com.yss.ssm.dao.IOrdersDao;
import com.yss.ssm.domin.Orders;
import com.yss.ssm.service.IOrdersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrdersServiceImpl  implements IOrdersService {

    private IOrdersDao ordersDao;

    @Override
    public void save(Orders orders) {

    }

    @Override
    public Orders findById(String id) throws Exception {

      Orders orders=  ordersDao.findById(id);

        return orders;
    }
}

package com.yss.ssm.service.impl;

import com.yss.ssm.dao.IOrdersDao;
import com.yss.ssm.dao.IProductDao;
import com.yss.ssm.domin.Orders;
import com.yss.ssm.domin.Product;
import com.yss.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductServiceImpl implements IProductService {
@Autowired
    private IProductDao ProductDao;
@Autowired
    private IOrdersDao OrdersDao;

    @Override
    public List<Product> findAll() throws Exception {

        return ProductDao.findAll();
    }

    @Override
    public void save(Product product) throws Exception {
        OrdersDao.save(product);
    }
}

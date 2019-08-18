package com.yss.ssm.service;

import com.yss.ssm.domin.Orders;
import com.yss.ssm.domin.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductService {


    List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;
}

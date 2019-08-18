package com.yss.ssm.dao;

import com.yss.ssm.domin.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface IProductDao {
    @Select("select *from product")
List<Product> findAll() throws Exception;

    @Select("select *from product where id=#{id}")
    public Product findById(String id) throws Exception;
}

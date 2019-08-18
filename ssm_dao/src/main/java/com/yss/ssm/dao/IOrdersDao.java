package com.yss.ssm.dao;

import com.yss.ssm.domin.Member;
import com.yss.ssm.domin.Orders;
import com.yss.ssm.domin.Product;
import org.apache.ibatis.annotations.*;

public interface IOrdersDao {
    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},# {productDesc},#{productStatus})")
    public void save(Product product);

    @Select("select * from orders where id=#{ordersId}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "orderNum", column = "orderNum"),
            @Result(property = "orderTime", column = "orderTime"),
            @Result(property = "orderStatus", column = "orderStatus"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "payType", column = "payType"),
            @Result(property = "orderDesc", column = "orderDesc"),
            @Result(property = "product", column = "productId", javaType = Product.class, one = @One(select = "com.yss.ssm.dao.IOrdersDao.findById")),
            @Result(property = "member", column = "memberId", javaType = Member.class, one = @One(select = "com.itheima.ssm.dao.IMemberDao.findById")),
            @Result(property = "travellers", column = "id", many = @Many(select = "com.yss.ssm.dao.IOrdersDao.findByOrdersId"))
    })
public Orders findById(String id) throws Exception;
        }

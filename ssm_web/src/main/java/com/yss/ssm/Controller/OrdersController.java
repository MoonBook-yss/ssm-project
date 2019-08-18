package com.yss.ssm.Controller;

import com.yss.ssm.domin.Orders;
import com.yss.ssm.service.impl.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersServiceImpl ordersService;

    @RequestMapping("/findById.do")
    public ModelAndView findById(String id) throws Exception {
        Orders orders= ordersService.findById(id);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject(orders);
        modelAndView.setViewName("orders-page-list");
        return modelAndView;
    }

}

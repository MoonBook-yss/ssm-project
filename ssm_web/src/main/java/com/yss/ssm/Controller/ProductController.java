package com.yss.ssm.Controller;


import com.yss.ssm.domin.Product;
import com.yss.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
@Autowired
private IProductService productService;
@RequestMapping("/findAll.do")
    public ModelAndView findAll(ModelAndView mv) throws Exception {
        List<Product> all = productService.findAll();
        mv.addObject("productList",all);
        mv.setViewName("product-list1");
        return mv;
    }
}

package com.yss.ssm.Controller;

import com.yss.ssm.domin.UserInfo;
import com.yss.ssm.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    UsersServiceImpl usersService;

    @RequestMapping("/findAll.do")
    ModelAndView findAll() throws Exception {
        List<UserInfo> list = usersService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList", list);
        modelAndView.setViewName("user-list");
        return modelAndView;
    }

    @RequestMapping("/save.do")
    String save(UserInfo userInfo) {
        usersService.save(userInfo);
        return "redirect:findAll.do";
    }
//http://localhost/user/save.do
@RequestMapping("/findById.do")
public ModelAndView findById(String id) throws Exception{
    ModelAndView mv = new ModelAndView();
    UserInfo userInfo = usersService.findById(id);
    mv.addObject("user",userInfo);
    mv.setViewName("user-show1");
    return mv;
}
    }


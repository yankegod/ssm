package cn.yanke.ssm.controller;

import cn.yanke.ssm.po.User;
import cn.yanke.ssm.service.UserService;
import cn.yanke.ssm.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yanke on 2016/12/22.
 */

@Controller
public class UserController4 {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryUser4")
    public ModelAndView queryUser() throws Exception{

        User user = userService.findUserById(1);
        System.out.println(user);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("user/user");

        return modelAndView;
    }
}

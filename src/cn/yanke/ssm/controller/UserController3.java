package cn.yanke.ssm.controller;

import cn.yanke.ssm.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanke on 2016/12/22.
 */
@Controller    //标示他是一个控制器
public class UserController3 {
    //查询用户
    //RequestMapping实现一个方法和一个url的对应映射，一般将url和方法名一样。
    @RequestMapping("/queryUser")  //访问时还是要加.action
    public ModelAndView queryUser() throws Exception{
        List<User> userList = new ArrayList<User>();

        User user1 = new User();
        user1.setName("xiaowangba呵呵呵嘻嘻");
        user1.setBirthday(Date.valueOf("1992-12-3"));

        User user2 = new User();
        user2.setName("hahaha");
        user2.setBirthday(Date.valueOf("2006-12-1"));

        userList.add(user1);
        userList.add(user2);

        //返回ModelAndView
        ModelAndView modelAndView =new ModelAndView();
        //相当于request.setAttribute,在jsp页面通过userlist取数据
        modelAndView.addObject("userList",userList);

        //指定视图
        //modelAndView.setViewName("/WEB-INF/jsps/user/userList.jsp");

        //在视图解析器中配置jsp路径的前缀和后缀之后可改为：
        modelAndView.setViewName("user/userList");

        return modelAndView;
    }

}

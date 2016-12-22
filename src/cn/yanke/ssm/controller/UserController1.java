package cn.yanke.ssm.controller;

import cn.yanke.ssm.po.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanke on 2016/12/22.
 */
public class UserController1 implements Controller {


    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
                   HttpServletResponse httpServletResponse) throws Exception {
        //调用service查找数据库，查询 用户列表，使用静态数据模拟
        //可用mybatis的逆向工程
        List<User> userList = new ArrayList<User>();

        User user1 = new User();
        user1.setName("xiaowang");
        user1.setBirthday(Date.valueOf("1992-12-3"));

        User user2 = new User();
        user2.setName("haha");
        user2.setBirthday(Date.valueOf("2006-12-1"));

        userList.add(user1);
        userList.add(user2);

        //返回ModelAndView
        ModelAndView modelAndView =new ModelAndView();
        //相当于request.setAttribute,在jsp页面通过userlist取数据
        modelAndView.addObject("userList",userList);

        //指定视图
        modelAndView.setViewName("/WEB-INF/jsps/user/userList.jsp");


        return modelAndView;
    }
}

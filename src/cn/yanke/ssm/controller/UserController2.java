package cn.yanke.ssm.controller;

import cn.yanke.ssm.po.User;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanke on 2016/12/22.
 * 根据适配器中的support方法判断Handler需要实现什么接口
 * 可通过response定义相应内容，如返回json数据。
 */
public class UserController2 implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest,
          HttpServletResponse httpServletResponse) throws ServletException, IOException {
        List<User> userList = new ArrayList<User>();

        User user1 = new User();
        user1.setName("小王");
        user1.setBirthday(Date.valueOf("1992-12-3"));

        User user2 = new User();
        user2.setName("哈哈");
        user2.setBirthday(Date.valueOf("2006-12-1"));

        userList.add(user1);
        userList.add(user2);

        //设置模型数据
        httpServletRequest.setAttribute("userList",userList);

        //设置转发的视图
        httpServletRequest.getRequestDispatcher("/WEB—INF/jsps/user/userList.jsp").
                forward(httpServletRequest,httpServletResponse);


//        //指定相应的数据格式，
//        httpServletResponse.setCharacterEncoding("utf-8");
//        httpServletResponse.setContentType("application/json;charset=utf-8");
//        httpServletResponse.getWriter().write("json串");


    }
}

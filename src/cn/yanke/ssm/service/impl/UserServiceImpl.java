package cn.yanke.ssm.service.impl;

import cn.yanke.ssm.mapper.UserMapper;
import cn.yanke.ssm.po.User;
import cn.yanke.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * Created by yanke on 2016/12/22.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(int id) throws Exception {
        return userMapper.findUserById(id);
    }


}

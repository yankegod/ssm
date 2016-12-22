package cn.yanke.ssm.service;

import cn.yanke.ssm.po.User;

/**
 * Created by yanke on 2016/12/22.
 */
public interface UserService {

    //按id查询用户
    public User findUserById(int id)throws Exception;
}

package cn.yanke.ssm.mapper;


import cn.yanke.ssm.po.User;
import java.util.List;
/**
 * Created by yanke on 2016/12/17.
 */
public interface UserMapper {

    //根据id查询用户
    public User findUserById(int id)throws Exception;

    //根据用户名查询用户列表
    public List<User> findUserByName(String name)throws Exception;

    //添加用户
    public void insertUser(User user)throws Exception;

    //根据姓名删除用户
    public void deleteUserByUsername(String username)throws Exception;

    //更新用户信息
    public void updateById(User user)throws Exception;
}

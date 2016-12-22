package test;

import cn.yanke.ssm.mapper.UserMapper;
import cn.yanke.ssm.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by yanke on 2016/12/19.
 */
public class UserMpperTest {
    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception{
        applicationContext = new ClassPathXmlApplicationContext("classpath:config/spring/applicationContext-dao.xml");
    }

    @Test
    public void testFindUserById() throws Exception {
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user =  userMapper.findUserById(1);
        System.out.println(user);
        System.out.println("haha");
    }
}

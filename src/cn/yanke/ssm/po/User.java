package cn.yanke.ssm.po;

import cn.yanke.ssm.controller.validation.ValidationGroup1;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

/**
 * Created by yanke on 2016/12/19.
 */
public class User {


    private int id;

    //校验字符，message提示校验出错显示信息,group标识此校验属于哪个分组，可定义多个分组
    @Size(min = 1,max = 8,message ="{user.name.length.error}",groups = {ValidationGroup1.class})
    private String name;

    @NotNull(message = "{user.birthday.IsNull}")
    private Date birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }




}

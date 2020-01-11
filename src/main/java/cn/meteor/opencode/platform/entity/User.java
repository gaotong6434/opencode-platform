package cn.meteor.opencode.platform.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    @TableField("user_id")
    private String userId;
    //名字
    private String name;
    //用户名
    private String username;
    //邮箱
    private String email;
    //密码
    private String password;
    //头像
    private String avatar;
    //介绍
    private String introduce;
    //地址
    private String address;
    //公司
    private String company;

}
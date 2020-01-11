package cn.meteor.opencode.platform.service.impl;

import cn.meteor.opencode.platform.entity.User;
import cn.meteor.opencode.platform.mapper.UserMapper;
import cn.meteor.opencode.platform.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> select(String username) {
        QueryWrapper<User> queryWrapper=new QueryWrapper<User>();
        queryWrapper.eq("username",username);
        List<User> users=userMapper.selectList(queryWrapper);
        System.out.println(users);
        return users;
    }

    @Override
    public Void update(User user,String id) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq("user_id",id);
        userMapper.update(user,queryWrapper);
        return null;
    }


}

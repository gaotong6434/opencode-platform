package cn.meteor.opencode.platform.service;

import cn.meteor.opencode.platform.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface IUserService extends IService<User> {

    List<User> select(String username);

    Void update(User user,String id);
}

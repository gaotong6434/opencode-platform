package cn.meteor.opencode.platform.mapper;

import cn.meteor.opencode.platform.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> selectAll();
}

package cn.meteor.opencode.platform.service;

import cn.meteor.opencode.platform.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IUserServiceTest {

    @Autowired
    private IUserService userService;

    @Test
    public void select() {
        List<User> users = userService.list();
        Assert.assertEquals(1L, users.size());
    }
}
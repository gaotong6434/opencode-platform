package cn.meteor.opencode.platform.mapper;

import cn.meteor.opencode.platform.entity.User;
import cn.meteor.opencode.platform.service.IUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IUserService iUserService;
    @Test
    public void testSelect() {
        List<User> users = userMapper.selectList(null);
        Assert.assertEquals(1L, users.size());
        Assert.assertEquals("gaoyt", users.get(0).getName());
    }

    @Test
    public void testSelect1() {
        List<User> users = userMapper.selectAll();
        Assert.assertEquals(1L, users.size());
        Assert.assertEquals("张晋雄", users.get(0).getName());
        System.out.println(users);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setAddress("SDafadsfa");
        iUserService.update(user,"12651615dsfsdf");
    }

    @Test
    public void create(){
        File dfile = new File("D:\\开源平台\\opencode-platform\\文件家");
        System.out.println(dfile.getAbsolutePath());
    }
}
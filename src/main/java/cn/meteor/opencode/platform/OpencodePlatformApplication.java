package cn.meteor.opencode.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.meteor.opencode.platform.mapper")
@SpringBootApplication
public class OpencodePlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpencodePlatformApplication.class, args);
    }

}

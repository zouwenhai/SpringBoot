
package com;

import com.process.SyncWorkPoolOrderTask;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})//屏蔽数据库连接
@ComponentScan(basePackages = {"com.process", "com.config.redis", "com.redis.utils", "com.swager"})

public class DemoApplication {

    @Resource
    private SyncWorkPoolOrderTask syncWorkPoolOrderTask;

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }


}

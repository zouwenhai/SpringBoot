
package com;

import com.process.SyncWorkPoolOrderTask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})//屏蔽数据库连接
@ComponentScan(basePackages = {"com.springutil", "com.process", "com.config.redis","com.redis.utils"})
public class DemoApplication {

    @Resource
    private SyncWorkPoolOrderTask syncWorkPoolOrderTask;

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }


}

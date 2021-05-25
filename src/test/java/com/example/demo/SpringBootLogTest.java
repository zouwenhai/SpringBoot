package com.example.demo;

import com.DemoApplication;
import com.redis.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/9/20 11:48
 * @work //TODO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest("DemoApplication.class")
@Slf4j
public class SpringBootLogTest {

    @Resource
    private RedisUtil redisUtil;
    @Test
    public void test() {
        log.trace("这是trace日志");
        log.debug("这是debug日志");
        log.info("这是info日志");  // springboot 默认设置的 info级别
        log.warn("这是warn日志");
        log.error("这是error日志");

    }


    @Test
    public void test2(){
        LocalDate date = LocalDate.parse("1999-06-23", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(LocalDate.now().minusYears(25));
        System.out.println(LocalDate.now().minusYears(18));
        System.out.println(date.isBefore(LocalDate.now().minusYears(18)));
        System.out.println(date.isAfter(LocalDate.now().minusYears(25)));

        System.out.println("PfVStnQNv4PU5UZ93J1rtA==".trim().length());
        if(date.isAfter(LocalDate.now().minusYears(25))&&date.isBefore(LocalDate.now().minusYears(18))){
            System.out.println(1);
        }
    }


    @Test
    public void test3(){
        redisUtil.set("aa", "aa", 0);
        redisUtil.get("aa", 0);


    }
}

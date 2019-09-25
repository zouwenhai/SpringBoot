package com.example.demo;

import com.DemoApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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


    @Test
    public void test() {
        log.trace("这是trace日志");
        log.debug("这是debug日志");
        log.info("这是info日志");  // springboot 默认设置的 info级别
        log.warn("这是warn日志");
        log.error("这是error日志");

    }
}

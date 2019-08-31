package com.example.demo;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName TestDemoApplication
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/8/31 22:45
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)//让测试运行于Spring环境
@SpringBootTest(classes = DemoCollection.class)
public class TestDemoApplication {
}

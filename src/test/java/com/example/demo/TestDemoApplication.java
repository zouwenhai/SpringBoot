package com.example.demo;

import com.process.SyncWorkPoolOrderTask;
import com.process.WorkPoolOrderContetxt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.annotation.Resources;

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

    @Resource
    private SyncWorkPoolOrderTask syncWorkPoolOrderTask;


    @Test
    public void test() {
        syncWorkPoolOrderTask.doTask(new WorkPoolOrderContetxt("1", "jack"));
    }
}

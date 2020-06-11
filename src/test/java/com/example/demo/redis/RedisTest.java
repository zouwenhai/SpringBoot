package com.example.demo.redis;

import com.example.demo.BaseTest;
import com.redis.utils.RedisUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.ref.WeakReference;

public class RedisTest extends BaseTest {


    @Autowired
    private RedisUtil redisUtil;


    /**
     * 通过redis实现分布式锁
     */

    @Test
    public void test1() {



    }


    //key存在

}

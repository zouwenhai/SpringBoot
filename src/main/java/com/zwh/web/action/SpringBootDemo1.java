
package com.zwh.web.action;

import com.redis.utils.RedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SpringBootDemo1 {


    @Resource
    private RedisUtil redisUtil;
    @RequestMapping(path = { "/helloSpringBoot" })
    public String HelloSpring() {

        System.out.println("hello spring boot");
        redisUtil.set("aa","aa",0);
        redisUtil.get("aa",0);
        return "hello spring boot";
    }

}

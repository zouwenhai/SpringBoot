package com;

import com.alibaba.fastjson.JSONObject;
import com.jdk8feature.lambda.User;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class Test {


    @org.junit.Test
    public void test() {

        User user = User.builder().userName("zcc").id(1).password("123").build();
        log.info("result:{}", JSONObject.toJSON(user));
        log.info("result:{}", user);


        Map map = new HashMap();
        new HashSet<>();
        new Hashtable<>();
        new TreeMap<>();
        new ConcurrentHashMap<>();
        new LinkedHashMap<>();


        new ArrayList<>();
       new HashSet<>();
       new HashMap<>();
       new Stack<>();
       new Vector<>();
       new LinkedList<>();


    }
}

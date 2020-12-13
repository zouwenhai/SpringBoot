package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Test
 * @Description TODO
 * @Author zouwenhai
 * @Date 2020/6/3 20:41
 * @Version 1.0
 */
public class Test {


    @org.junit.Test
    public void test1() {
        Object1 object1 = new Object1();
        Map<String, Object1> map = new HashMap<>();
        map.put("2", object1);
        Object1 object11 = new Object1();
        object1.getA();
        //这行代码为什么会报空指针异常
        object11.setA(map.containsKey("2") ? map.get("2").getA() : 0);

    }

}

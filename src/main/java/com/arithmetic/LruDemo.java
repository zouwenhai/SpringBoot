package com.arithmetic;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName LruDemo
 * @Description //TODO
 * @Author zouwenhai
 * @Date 2019/8/13 9:07
 * @Version 1.0
 */
public class LruDemo {


    /**
     * lru算法
     */
    @Test
    public void test() {

        Map<String, Integer> map = new LinkedHashMap(4, 0.75f, true);
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue());
            System.out.println("1");
        }


    }

}

package com.collect;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/9/16 17:28
 * @work //LinkedList集合方法
 */
@Slf4j
public class LinkedListTest {


    @Test
    public void test() {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");


    }


    @Test
    public void test2() {
        Map<String, Integer> marketUserMap = new LruLinkedMap<>(4, 0.75f, true);
        marketUserMap.put("1", 1);
        marketUserMap.put("2", 2);
        marketUserMap.put("3", 3);
        marketUserMap.put("4", 4);
        for (Map.Entry<String, Integer> entry : marketUserMap.entrySet()) {
            log.info(entry.getKey());
        }
        marketUserMap.get("1");
        for (Map.Entry<String, Integer> entry : marketUserMap.entrySet()) {
            log.info(entry.getKey());
        }
    }

}

package com.collect;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/9/16 16:52
 * @work //集合有关功能测试类
 */
public class CollectionTest {


    /**
     * ArrayList的排序
     */
    @Test
    public void test() {

        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        Collections.sort(num, (x, y) -> {//升序
            return x - y;
        });

        num.forEach(a -> {
            System.out.println(a);
        });

    }







}

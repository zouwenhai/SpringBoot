package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Author zouwenhai
 * @Date 2020/7/31 19:19
 * @Version 1.0
 */
public class Test {


    @org.junit.Test
    public void test() {
        List<Integer> list = Arrays.asList(1, 3, 5, 2, 4, 8, 6, 7);
        int size = list.size();
        if (size % 2 == 0) {
            List<Integer> subList = list.subList(0, size / 2);
        }

    }
}

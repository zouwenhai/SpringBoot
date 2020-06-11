package com.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/10/25 15:09
 * @work //TODO
 */
@Slf4j
public class ArrayTes {

    /**
     * 一维
     * 数组的实例化方式
     */
    public void test() {
        int[] a = new int[2];
        a[0] = 1;
        a[1] = 2;
        //
        int[] b = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    }

    @Test
    public void test2() {
        int[][] a = new int[3][4];
        log.info("行数:{}", a.length);
        log.info("列数:{}", a[0].length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i + j;
            }
        }
        //stream流的方式输出
        Arrays.stream(a).forEach(b -> {
            Arrays.stream(b).forEach(
                    c -> {
                        out.println(c);
                    });
        });
    }


    @Test
    public void test3() {

        int[] a = {1, 2, 3};
        int[] b = new int[]{1, 2, 3};
        int[] c = new int[100];
        for (int i = 0; i < 100; i++) {
            c[i] = i;
        }

    }


    /**
     * 数组转集合
     */
    @Test
    public void test4() {
        String[] pod = new String[]{"haha", "xixi", "heihei"};
        Integer[] b = new Integer[]{1, 3, 5};
        //数组只能是包装类
        Arrays.asList(b);
        List<String> list = Arrays.asList(pod);



    }


}

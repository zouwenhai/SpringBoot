package com.exception;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2020/1/14 13:59
 * @work //TODO
 */
public class ExceptionDemo {


    /**
     * 捕获异常后，for循环可以继续执行
     * 加上continue，异常后面的代码不会执行，不加的话，会继续执行后续代码
     */
    @Test
    public void getTest() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("e"); //转数字时会出错抛出异常
        list.add("4");
        for (String str : list) {
            try {
                int num = Integer.parseInt(str);  //异常点
                System.out.println(num);
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
            System.out.println("***");
        }
    }
}

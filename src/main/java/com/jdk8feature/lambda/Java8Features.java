package com.jdk8feature.lambda;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;

/**
 * @ClassName Java8Features
 * @Description jdk8新特性
 * @Author zouwenhai
 * @Date 2019/7/3 19:20
 * @Version 1.0
 */
public class Java8Features {

    public List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


    /**
     * * 1.Lambda表达式
     */
    @Test
    public void testLambda() {
        list.forEach(System.out::println);
        list.forEach(e -> System.out.println("方式二：" + e));
    }


    @Test
    public void testStream() {


        List<Integer> nums = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("求和：" + nums.stream()//转换成Stream
                .filter(team -> team != null)//过滤
                .distinct()//去重
                .mapToInt(num -> num * 2)//map操作
                .skip(2)//跳过前两个元素
                .limit(4)//限制取前四个元素
                .peek(System.out::println)//流式处理对象函数
                .sum());


    }


    /**
     * 实现runnable接口
     */


    public void test1(){

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
            }
        };
        runnable.run();


        Runnable run1 = () -> System.out.println(1);
        run1.run();
    }


    @Test
    public void test2(){
        Comparator<Integer> com = (x, y) -> {
            System.out.println("x为"+x);
            System.out.println("y为"+y);
            return Integer.compare(x,y);
        };
        System.out.println(com.compare(1111,111));
        // x为1111
        // y为111
        // 1
    }

}

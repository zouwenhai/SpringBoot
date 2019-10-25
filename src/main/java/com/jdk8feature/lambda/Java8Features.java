

package com.jdk8feature.lambda;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

import static java.lang.System.out;

/**
 * @ClassName Java8Features
 * @Description jdk8新特性
 * @Author zouwenhai
 * @Date 2019/7/3 19:20
 * @Version 1.0
 */

@Slf4j
public class Java8Features {

    public List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


    /**
     * * 1.Lambda表达式
     */
    @Test
    public void testLambda() {
        list.forEach(out::println);
        list.forEach(e -> out.println("方式二：" + e));
    }


    /**
     * stream用法
     */
    @Test
    public void testStream() {


        List<Integer> nums = Lists.newArrayList();
        for (int i = 0; i < 1000; i++) {
            nums.add(i);
        }
 /*       out.println("求和：" + nums.stream()//转换成Stream
                .filter(team -> team != null)//过滤
                .distinct()//去重
                .mapToInt(num -> num * 2)//map操作
                .skip(2)//跳过前两个元素
                .limit(4)//限制取前四个元素
                .peek(out::println)//流式处理对象函数
                .sum());*/

        //转换成流
        Stream<Integer> stream = nums.stream();
        Stream<Integer> stream1 = nums.parallelStream();
        Long statTime = System.currentTimeMillis();
        stream.filter(a -> {
            return a % 2 == 0;
        }).forEach(System.out::println);
        Long endTime = System.currentTimeMillis();
        log.info("time:{}", endTime - statTime);

        Long statTime1 = System.currentTimeMillis();
        stream1.filter(a -> {
            return a % 2 == 0;
        }).forEach(System.out::println);
        Long endTime2 = System.currentTimeMillis();
        log.info("time1:{}", endTime2 - statTime1);



    }


    /**
     * 实现runnable接口
     * 无参数无返回值
     */


    public void test1() {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                out.println("1");
            }
        };
        runnable.run();


        Runnable run1 = () -> out.println(1);
        run1.run();
    }


    @Test
    public void test2() {
        Comparator<Integer> com = (x, y) -> {
            out.println("x为" + x);
            out.println("y为" + y);
            return Integer.compare(x, y);
        };

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };


        out.println(com.compare(1111, 111));
        // x为1111
        // y为111
        // 1
    }


    /**
     * @Builder属性的用法
     */
    @Test
    public void test3() {
        //创建对象
        User user = User.builder().id(1).userName("jack").password("123").build();
        //修改对象属性
        user = user.toBuilder().userName("tom").build();
        //用@Builder(toBuilder = true)和@Getter注解，只公开getter,不对外公开属性写的操作。

        //@Value注解作用
        //1）有参构造方法；
        //2）只添加@Value注解，没有其他限制，那么类属性会被编译成final的，因此只有get方法，而没有set方法。
        Student student = new Student(1L, "jack", 18, 1);

    }

    /**
     * Optional 的用法
     */
    @Test
    public void test4() {
        String a = "";
        //判空方法一
        boolean flag = Optional.empty().equals(Optional.ofNullable(a));
        log.info("flag:{}", flag);
        //判空方法二
        boolean flag2 = Optional.ofNullable(a).isPresent();
        log.info("flag2:{}", flag2);


    }


    /**
     * ArrayList的sort的方法
     * 多个字段排序
     */
    @Test
    public void test5() {
        Teacher teacher = new Teacher();
        teacher.setId(1L);
        teacher.setOrderNum(2);
        Teacher teacher1 = new Teacher();
        teacher1.setId(2L);
        teacher1.setOrderNum(1);
        Teacher teacher2 = new Teacher();
        teacher2.setId(2L);
        teacher2.setOrderNum(3);
        out.println(teacher1.toString());
        List<Teacher> list = new ArrayList<>(Arrays.asList(teacher, teacher1, teacher2));
    /*    list.sort((a, b) -> {
            if (a.getId() == b.getId()) {
                return a.getOrderNum() - b.getOrderNum();
            } else {
                return a.getId().intValue() - b.getId().intValue();
            }
        });*/

/*        list.sort((a, b) -> {
            if (a.getId().intValue() > b.getId().intValue()) {
                return -1;
            }
            if (a.getId().intValue() == b.getId().intValue()) {
                return 0;
            }
            return 1;

        });*/
        list.sort((a, b) -> {
            return b.getId().intValue() - a.getId().intValue();
        });
        log.info(JSONObject.toJSONString(list));
        list.sort((a, b) -> {
            return b.getId().intValue() - a.getId().intValue();
        });
        log.info(JSONObject.toJSONString(list));

     /*   list.stream().sorted((a,b)->{
            return a-b;
        }).forEach(c->{
            System.out.println(c);
        });*/

    }


}



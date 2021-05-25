package com.array;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Collectors类的用法
 *
 * @author zouwenhai
 * @date 2021/1/28 14:04
 */
public class CollectorTest {


    @Test
    public void test1() {

        List<UserBO> list = Arrays.asList(UserBO.builder().id(1).name("张三").build(), UserBO.builder().id(1).name("张三").build(), UserBO.builder().id(1).name("李四").build(), UserBO.builder().id(2).name("王五").build());
        Map<Integer, List<UserBO>> map = list.stream().collect(Collectors.groupingBy(UserBO::getId));
        UserBO userBO1 = new UserBO(1, "张三");
        UserBO userBO2 = new UserBO(2, "张三");
        System.out.println(Objects.equals(userBO1,userBO2));
        System.out.println(System.identityHashCode(userBO1));
        System.out.println(System.identityHashCode(userBO2));
        Set<UserBO> set = list.stream().collect(Collectors.toSet());

    }


}

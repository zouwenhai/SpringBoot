package com.array;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @ClassName ArrayTest
 * @Description 数组
 * @Author zouwenhai
 * @Date 2019/9/21 18:56
 * @Version 1.0
 */
public class ArrayTest {

    /***
     * 数组的特点，长度固定
     */

    @Test
    public void test() {
        //3种数组实现方式
        int[] a = {1};
        int[] b = new int[10];
        int[] c = new int[]{1, 2};

    }


    @Test
    public void test2() {

        int[][] a = new int[2][3];
        a[0][0] = 0;
        a[0][1] = 1;
        a[0][2] = 2;
        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 5;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }


    }


    @Test
    public void test4() {

        String time = LocalDate.now().minusDays(1L).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(time);
        User user1 = new User();
        user1.setTime("2020-03-25");
        user1.setUserName("1");
        User user2 = new User();
        user2.setTime("2020-03-25");
        user2.setUserName("2");
        User user3 = new User();
        user3.setTime("2020-03-25");
        user3.setUserName("1");
        User user4 = new User();
        user4.setTime("2020-03-25");
        user4.setUserName("2");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        List<User> userList = new ArrayList<>();
        userList.add(user3);
        userList.add(user4);
        users.forEach(e -> {
            if (userList.contains(e)) {
                System.out.println(e.getClass());
            }
        });

        String s = "asfsdfdsfd";

        List<User> users1 = new ArrayList<>();

        List<User> users2 = new ArrayList<>();
        users1.retainAll(users2);

    }



}

package com.annotation;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/8/22 16:33
 * @work //TODO
 */
public class Test {


    @org.junit.Test
    public void test() {
        User user = new User(1L, new AdminRole());
        String a = user.getRoleValue();
        System.out.println(a);


    }

    public void test2() {
        String a = "b";
        System.out.println(Objects.equals(a, ""));
    }


    public void test3() {
        List<String> a = Arrays.asList("1", "2", "3", "4", "5", "6", "7");
        int page = a.size() % 2 == 0 ? a.size() / 2 : a.size() / 2 + 1;
        for (int i = 0; i < a.size(); i++) {
            List<String> sublist = a.subList(i * 2, Math.min((i + 1) * 2, a.size()));
        }
    }
}

package com.annotation;

import org.springframework.beans.BeanUtils;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/8/22 16:33
 * @work //TODO
 */
public class Test {


    @org.junit.Test
    public void test(){
        User user = new User(1L,new AdminRole());
        String a = user.getRoleValue();
        System.out.println(a);




    }
}

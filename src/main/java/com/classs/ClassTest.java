package com.classs;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/11/8 11:41
 * @work //java的类类型
 */
@Slf4j
public class ClassTest {


    @Test
    public void test() {
        Person person = new Person(1L, "jack", 21);
        Class personClass = person.getClass();
        //
        personClass.getAnnotation(null);
        String name = personClass.getName();
        personClass.getAnnotatedInterfaces();
        personClass.getAnnotatedSuperclass();
        personClass.getFields();



    }
}

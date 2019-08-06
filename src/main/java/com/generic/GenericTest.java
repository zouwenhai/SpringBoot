package com.generic;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @ClassName GenericTest
 * @Description 测试
 * @Author zouwenhai
 * @Date 2019/5/27 15:14
 * @Version 1.0
 */
@Slf4j
public class GenericTest {


    /***
     * 泛型类
     */
    @Test
    public void test() {

        GenericClass<String> str = new GenericClass<>();
        str.setData("你好泛型");
        GenericClass<Integer> integer = new GenericClass<>();
        integer.setData(123132);
        log.info("str:{}", str.getData());
        log.info("int:{}", integer.getData());
        log.info("str class:{}", str.getClass());
        log.info("int:{}", integer.getClass());
        System.out.println(str.getClass() == integer.getClass());

        //不同的泛型实参还是生产原来最基本的类型


    }


    /**
     * 泛型方法
     *
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    @Test
    public void test2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        GenericWay genericWay = new GenericWay();
        User user = (User) genericWay.getObject(Class.forName("com.generic.User"));
        GenericClass<String> str = new GenericClass<>();


    }


    @Test
    public void test3() {
        GenericClass<Integer> integer = new GenericClass<>();
        integer.setData(123213);
        GenericClass<Number> number = new GenericClass<>();
        number.setData(123121);
        //   show(integer);
        show(number);
        //show(integer) 编译时就会报错，说明即使Integer是Number的子类，
        // GenericClass<Integer>也是不能看成 GenericClass<Number>的子类
        //同一种泛型可以对应多个版本（因为参数类型是不确定的），不同版本的泛型类实例是不兼容的。

        show2(integer);
        show2(number);
    }


    public void show(GenericClass<Number> genericClass) {


    }

    /**
     * ?类型通配符,相当于所有类型的父类
     * @param genericClass
     */
    public void show2(GenericClass<?> genericClass) {


    }
}

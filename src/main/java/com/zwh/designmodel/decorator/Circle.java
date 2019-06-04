package com.zwh.designmodel.decorator;

/**
 * @ClassName Circle
 * @Description 圆形
 * @Author zouwenhai
 * @Date 2019/6/4 16:48
 * @Version 1.0
 */
public class Circle  implements Shape{

    @Override
    public void draw() {
        System.out.println("画出圆形");
    }
}

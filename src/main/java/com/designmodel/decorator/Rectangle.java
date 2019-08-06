package com.designmodel.decorator;

/**
 * @ClassName Rectangle
 * @Description 三角形
 * @Author zouwenhai
 * @Date 2019/6/4 16:49
 * @Version 1.0
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("画出三角形");
    }
}

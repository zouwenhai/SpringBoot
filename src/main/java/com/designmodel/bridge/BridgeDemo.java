package com.designmodel.bridge;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/11/1 11:25
 * @work //桥接模式
 */
public class BridgeDemo {


    public static void main(String[] args) {

        Shape circle = new Circle(new GreenCircle());
        Shape circle1 = new Circle(new RedCircle());
        circle.draw();
        circle1.draw();
    }
}

package com.designmodel.bridge;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/11/1 11:19
 * @work //TODO
 */
public class Circle extends Shape {


    public Circle(DrawApi drawApi) {
        super(drawApi);
    }

    @Override
    public void draw() {
        drawApi.drawCircle();
    }
}

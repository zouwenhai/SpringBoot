package com.designpattern.structure.decorator;

/**
 * @ClassName DecoratorShape
 * @Description 接口抽象装饰类
 * @Author zouwenhai
 * @Date 2019/6/4 16:50
 * @Version 1.0
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}

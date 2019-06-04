package com.zwh.designmodel.decorator;

/**
 * @ClassName SpecificShapeDecorator
 * @Description 具体的装饰实现类
 * @Author zouwenhai
 * @Date 2019/6/4 16:55
 * @Version 1.0
 */
public class SpecificShapeDecorator extends ShapeDecorator {


    public SpecificShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);

    }


    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}

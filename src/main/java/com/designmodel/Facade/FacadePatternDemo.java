package com.designmodel.Facade;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/11/1 14:56
 * @work //外观模式
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}

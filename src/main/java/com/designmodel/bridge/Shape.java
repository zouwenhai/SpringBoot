package com.designmodel.bridge;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/11/1 11:18
 * @work //TODO
 */
public abstract class Shape {

    protected DrawApi drawApi;


    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}

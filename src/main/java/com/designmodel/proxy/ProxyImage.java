package com.designmodel.proxy;

/**
 * @ClassName ProxyImage
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/6/5 10:20
 * @Version 1.0
 */
public class ProxyImage implements Image {

    private RealImage realImage;

    private String fileName;


    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {//保证堆中只有一个对象（但是多线程就会有问题）
            realImage = new RealImage(fileName);
        }
        realImage.display();

    }
}

package com.designmodel.proxy;

/**
 * @ClassName RealImage
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/6/5 10:18
 * @Version 1.0
 */
public class RealImage implements Image {


    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {

    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}

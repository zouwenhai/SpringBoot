package com.jicheng;

public class Test {


    @org.junit.Test
    public void test() {
        Animals a = new Animals();
        a.move();
        Animals b = new Dog();
        b.move();
        Dog d = new Dog();
        d.bark();
        System.out.println(d instanceof Animals);
        System.out.println(b instanceof Dog);
        System.out.println(b instanceof Animals);
        System.out.println(a instanceof Dog);
    }


    @org.junit.Test
    public void test2() {
        InterfaceImpl interfaceImpl = new InterfaceImpl();
        interfaceImpl.way1();
    }
}

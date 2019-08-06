package com.designmodel.delegate;

/**
 * @ClassName C
 * @Description C就是委派类，AB就是具体的被委派类
 * @Author zouwenhai
 * @Date 2019/6/5 11:12
 * @Version 1.0
 */
public class C implements I {

    I i = new A();


    @Override
    public void f() {
        i.f();
    }

    @Override
    public void g() {
        i.g();
    }



    public void toA(){
        i = new A();
    }


    public void toB(){
        i = new B();
    }
}

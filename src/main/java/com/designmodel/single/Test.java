package com.designmodel.single;

/**
 * @ClassName Test
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/5/12 22:06
 * @Version 1.0
 */
public class Test {


    @org.junit.Test
    public void test() {

        new Thread() {

            @Override
            public void run() {
                System.out.println(Singleton.getSingleton());
            }
        }.start();

        new Thread() {

            @Override
            public void run() {
                System.out.println(Singleton.getSingleton());
            }
        }.start();


        new Thread() {

            @Override
            public void run() {
                System.out.println(Singleton.getSingleton());
            }
        }.start();

    }


    @org.junit.Test
    public void test2() {




        new Thread() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+Singleton2.getSingleton());
            }
        }.start();

        new Thread() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+Singleton2.getSingleton());
            }
        }.start();


        new Thread() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+Singleton2.getSingleton());
            }
        }.start();


        new Thread() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+Singleton2.getSingleton());
            }
        }.start();


        new Thread() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+Singleton2.getSingleton());
            }
        }.start();

    }


    public static void main(String[] args) {

     /*   new Thread() {

            @Override
            public void run() {
                System.out.println(Singleton2.getSingleton());
            }
        }.start();

        new Thread() {

            @Override
            public void run() {
                System.out.println(Singleton2.getSingleton());
            }
        }.start();


        new Thread() {

            @Override
            public void run() {
                System.out.println(Singleton2.getSingleton());
            }
        }.start();*/

/******************************************************/

    /*    new Thread() {

            @Override
            public void run() {
                System.out.println(Singleton2.getSingleton2());
            }
        }.start();

        new Thread() {

            @Override
            public void run() {
                System.out.println(Singleton2.getSingleton2());
            }
        }.start();


        new Thread() {

            @Override
            public void run() {
                System.out.println(Singleton2.getSingleton2());
            }
        }.start();*/

        /********************************************/
        new Thread() {

            @Override
            public void run() {
                System.out.println(Singleton2.getSingleton3());
            }
        }.start();

        new Thread() {

            @Override
            public void run() {
                System.out.println(Singleton2.getSingleton3());
            }
        }.start();


        new Thread() {

            @Override
            public void run() {
                System.out.println(Singleton2.getSingleton3());
            }
        }.start();

    }

}






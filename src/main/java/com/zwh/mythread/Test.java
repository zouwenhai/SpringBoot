package com.zwh.mythread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * @ClassName Test
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/7/3 19:55
 * @Version 1.0
 */
public class Test {



    @org.junit.Test
    public void test1(){

        //
        new MyThread1().start();

        //
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);
        thread.start();
        //
        Callable onecallable = new SomeCallable();
        FutureTask onetask = new FutureTask(onecallable);
        Thread thread3 = new Thread(onetask);
        thread3.start();

    }



    public static void main(String[] args) throws ExecutionException,
            InterruptedException {
        System.out.println("----程序开始运行----");
        Date date1 = new Date();

        int taskSize = 5;
        // 创建一个线程池
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);
        // 创建多个有返回值的任务
        List<Future> list = new ArrayList<Future>();
        for (int i = 0; i < taskSize; i++) {
            Callable c = new MyCallable(i + " ");
            // 执行任务并获取Future对象
            Future f = pool.submit(c);
            // System.out.println(">>>" + f.get().toString());
            list.add(f);
        }
        // 关闭线程池
        pool.shutdown();

        // 获取所有并发任务的运行结果
        for (Future f : list) {
            // 从Future对象上获取任务的返回值，并输出到控制台
            System.out.println(">>>" + f.get().toString());
        }

        Date date2 = new Date();
        System.out.println("----程序结束运行----，程序运行时间【"
                + (date2.getTime() - date1.getTime()) + "毫秒】");
    }
}



class MyCallable implements Callable<Object> {
    private String taskNum;

    MyCallable(String taskNum) {
        this.taskNum = taskNum;
    }



    public Object call() throws Exception {
        System.out.println(">>>" + taskNum + "任务启动");
        Date dateTmp1 = new Date();
        Thread.sleep(1000);
        Date dateTmp2 = new Date();
        long time = dateTmp2.getTime() - dateTmp1.getTime();
        System.out.println(">>>" + taskNum + "任务终止");
        return taskNum + "任务返回运行结果,当前任务时间【" + time + "毫秒】";
    }



}

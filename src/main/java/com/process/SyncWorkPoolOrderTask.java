package com.process;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/9/26 10:39
 * @work //TODO
 */

@Component
public class SyncWorkPoolOrderTask {


    @Resource
    private ExecutorService threadPoolExecutor;


    public void doTask(WorkPoolOrderContetxt workPoolOrderContetxt) {
        threadPoolExecutor.execute(new MyTask("线程1", workPoolOrderContetxt));
    }

    static class MyTask implements Runnable {
        private String name;
        private WorkPoolOrderContetxt workPoolOrderContetxt;

        public MyTask(String name, WorkPoolOrderContetxt workPoolOrderContetxt) {
            this.name = name;
            this.workPoolOrderContetxt = workPoolOrderContetxt;
        }

        @Override
        public void run() {
            try {
                System.out.println(this.toString() + " is running!");
                Thread.sleep(3000); //让任务执行慢点
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "MyTask [name=" + name + "]";
        }
    }

}

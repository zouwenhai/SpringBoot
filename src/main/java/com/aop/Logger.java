package com.aop;

import java.util.Date;

/**
 * @ClassName Logger
 * @Description 日志
 * @Author zouwenhai
 * @Date 2019/7/2 21:17
 * @Version 1.0
 */
public class Logger {


    public static void start(){
               System.out.println(new Date()+ " say hello start...");
             }




            public static void end(){
                System.out.println(new Date()+ " say hello end");
            }
}

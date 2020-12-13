package com.file.utils;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName HttpGetServerSource
 * @Description 获取远程服务器资源
 * @Author zouwenhai
 * @Date 2019/4/29 18:16
 * @Version 1.0
 */
public class HttpGetServerSource {

    public static void main(String[] args){
        File txt=new File("D:\\opt\\export\\");
        if(!txt.exists()&&!txt.isDirectory()){
            txt.mkdirs();
        }

        System.out.println(File.separator);
        System.out.println("/");
        System.out.println("//");

    }









}

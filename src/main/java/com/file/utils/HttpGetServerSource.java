package com.file.utils;

import org.junit.Test;

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



    @Test
    public void deleteFile() {


        try {
            // Specify the file name and path
            File file = new File("D:\\opt\\heyrupee\\niuxin\\2020-06-01\\50929043.MP3");
      /* the delete() method return true if the file
      deleted successfully else it return false
       */
            if (file.delete()) {
                System.out.println(file.getName() + "is deleted");
            } else {
                System.out.println("Delete failed.");
            }
        } catch (Exception e) {
            System.out.println("Exception occured");
            e.printStackTrace();
        }
    }








}

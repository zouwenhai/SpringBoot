package com.file.utils;

import org.junit.Test;

import java.io.*;

/**
 * @ClassName FileUtils
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/9/3 0:20
 * @Version 1.0写入
 */
public class FileUtils {


    //TODO 将字符串变成字节，写入文件


    //TODO 将字符串变成字节，写入文件，上传到服务器上。

    //TODO 将字符串变成字节流



    @Test
    public void FileUpload() throws Exception {


        String content = "Hello Word";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(content.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("D://20190903.txt");
        byte bytes[] = new byte[1024];
        int temp=0;
        while ((temp = byteArrayInputStream.read(bytes))!=-1){//temp返回值是什么

        fileOutputStream.write(bytes,0,temp);
        }
        byteArrayInputStream.close();
        fileOutputStream.close();
    }



    /**
     * 文件复制
     *
     * @throws Exception
     */
    public void FileCopy() throws Exception {
        File file = new File("dome.txt");
        if (!file.isFile()) {    //判断文件是否存在
            System.out.println("该文件不存在，无法Copy！");
            return;
        }
        FileInputStream fis = new FileInputStream(file);   //"src\\"+file.getName()
        FileOutputStream fos = new FileOutputStream("src/" + file.getName());//把文件拷（输出）到src下

        byte bytes[] = new byte[1024];
        int temp = 0;  //边读边写
        while ((temp = fis.read(bytes)) != -1) {  //读
            fos.write(bytes, 0, temp);   //写
        }
        fis.close();
        fos.close();
        System.out.println("文件拷贝成功！");
    }











}


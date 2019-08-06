package com.designmodel.prototype;

import org.junit.Test;

/**
 * @ClassName test
 * @Description 浅克隆/深克隆
 * @Author zouwenhai
 * @Date 2019/5/19 16:10
 * @Version 1.0
 */
public class test {


    @Test
   public void test1(){


        Resume resume = new Resume();
        System.out.println(resume);
        try {
            //克隆方法不是new，是直接从内存中copy对象
            Resume resume1 = (Resume)resume.clone();
            System.out.println(resume1);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }



    @Test
    public void test2() throws Exception{
        Resume resume = new Resume();
        resume.setAge(2);
        resume.setName("简历1");
        resume.setHobby(new String[]{"打篮球","游泳"});
        Resume resume1 = (Resume)resume.clone();
        resume1.setAge(16);
        String[] hobby = resume1.getHobby();
        hobby[0]="睡觉";
        System.out.println(resume);
        System.out.println(resume.toString());
        System.out.println("Hobby:"+resume.getHobby());
        System.out.println(resume1);
        System.out.println(resume1.toString());
        System.out.println("Hobby2:"+resume1.getHobby());
        System.out.println("Hobby2:"+resume1.getHobby());





    }
}

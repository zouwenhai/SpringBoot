package com.example.demo;

import packagea.A;
import packagea.E;

import java.time.LocalDateTime;

/**
 * @ClassName Test
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/6/8 22:10
 * @Version 1.0
 */
public class Test {


    public static void main(String[] args){

     String str="2019-09-11 09:13:18";
     String a=str.split(" ")[0];
     System.out.println(a);

     System.out.println(LocalDateTime.now());



    }

    @org.junit.Test
    public int  add(){

        int a=1;
        int b=2;
        int c=a+b;
        return c;
    }



    public void test2(){

        A e = new E();
    }





    @org.junit.Test
    public void test(){

        String a="08:03:37";
        String[] times = a.split(":");
        float totalminutets=0;
        float h = 0;
        float m= 0;
        float s=0;
        System.out.println(times[0].substring(1,1));

        if(times[0].substring(0,1).equals("0")){
            String hour = times[0].substring(1,2);
            h = Float.parseFloat(hour)*60;
        }
        else{
            h = Float.parseFloat(times[0])*60;
        }
        if(times[1].substring(0,1).equals("0")){
            m = Float.parseFloat(times[1].substring(1,2));
        }
        else{
            m = Float.parseFloat(times[1]);
        }


        if(times[2].substring(0,1).equals("0")){
            s= Float.parseFloat(times[2].substring(1,2))/60;
        }
        else{
            s= Float.parseFloat(times[2])/60;
            System.out.println(m);
        }

        totalminutets = h+m+s;
        System.out.println(totalminutets);
    }



}


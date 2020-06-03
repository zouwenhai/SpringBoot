package com.date;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/9/4 10:48
 * @work //时间处理
 */
public class DateTimeUtils {


    /**
     * 时间截取
     */
    @Test
    public void test() {

        String talkTime = "08:30:31";
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.parse(talkTime, df);
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();
        //保留两位小数
        float num = (float) (31 / 60);
        System.out.println(num);

        int a = 9;
        int b = 7;
        DecimalFormat df2 = new DecimalFormat("0.00");
        BigDecimal bigDecimal1 = new BigDecimal(hour * 30);
        BigDecimal bigDecima2 = new BigDecimal(minute);
        BigDecimal bigDecima3 = new BigDecimal(second / 60);

        float e = bigDecimal1.floatValue();
        float d = bigDecima2.floatValue();
        float f = bigDecima3.floatValue();
        System.out.println("e:" + e);
        System.out.println("d:" + d);
        System.out.println(e + d + f);

        System.out.println(String.valueOf(df2.format((float) (hour * 60 + minute + second / 60))));
        System.out.println(df2.format((float) 31 / 60));
        System.out.println(df2.format(a / (float) b));
        System.out.println(df2.format((float) a / (float) b));
        System.out.println(df2.format((float) (a / b)));

    }


    /**
     * float类型数据的除法，保留两位小数
     */
    @Test
    public void test3() {
        String talkTime = "08:30:31";
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.parse(talkTime, df);
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();
        float j = hour * 1.0f;
        float k = minute * 1.0f;
        float l = second * 1.0f;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        float n = l / 60;
        System.out.println(String.valueOf(decimalFormat.format(n)));
        System.out.println(decimalFormat.format(j + k + n));
    }

    /**
     * LocalDateTime的用法
     */
    @Test
    public void test4() {

        //当前时间年月日时分秒
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //当前时间年月日时分秒
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        //当前时间年月日字符串
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        //获取当前时间时分秒部分
        System.out.println(LocalTime.now());
        //字符串变成年月月时分秒
        System.out.println(LocalDateTime.parse("2019-09-18 17:23:50", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        //字符串变成时分秒
        System.out.println(LocalTime.parse("08:20:30", DateTimeFormatter.ofPattern("HH:mm:ss")));

    }

    /**
     * LocalTime的用法
     */
    public void test5() {


    }


    /**
     * LocalDate的用法
     */
    @Test
    public void test6() {

        //获取当前的日期年月日
        System.out.println(LocalDate.now());

        //根据参数设置日期
        System.out.println(LocalDate.of(2017, 9, 30));

        LocalDate localDate = LocalDate.now();
        //获取当前日期是所在月的第几天
        System.out.println(localDate.getDayOfMonth());
        //获取当前日期是所在年的第几天
        System.out.println(localDate.getDayOfYear());
        //获取当前日期是星期几（星期的英文全称）
        System.out.println(localDate.getDayOfWeek());
        //获取当前月份（全英文名称）
        System.out.println(localDate.getMonth());
        //获取当前月份所在的数值
        System.out.println(localDate.getMonthValue());
        //获取当前月份有多少天
        System.out.println(localDate.lengthOfMonth());
        //获取当前所在年有多少天
        System.out.println(localDate.lengthOfYear());
        //获取当前日期所在年是否是闰年
        System.out.println(localDate.isLeapYear());



    }


    @Test
    public void test7(){
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        String s="2020-03-102020-03-20";
        String[] times  = s.split("/");
        //天数差
        String startTime = "2020-02-10";
        String endTime = "2020-03-20";
        long daysNum = LocalDate.parse(endTime).toEpochDay() - LocalDate.parse(startTime).toEpochDay();
        for (long i = 0; i <=daysNum; i++) {
           System.out.println(LocalDate.parse(startTime).plusDays(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        }
    }





}

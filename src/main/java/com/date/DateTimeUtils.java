package com.date;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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


}

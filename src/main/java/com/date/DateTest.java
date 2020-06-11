package com.date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTest {


    @Test
    public void test2() {

        System.out.println(LocalDate.now().toString());

        LocalDate localDate = LocalDate.parse("2020-05-28").plusDays(1);
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        int a = 4000;
        if (a == 4000) {
            System.out.println("jin");
        } else {
            System.out.println("no");
        }
        StringBuffer stringBuffer = new StringBuffer("sh0793968864,79589907,79600942,79601210,79601723,79608601,79608795,|sh0793968864,79589907,79600942,79601210,79601723,79608601,79608795,|");

        System.out.println(stringBuffer.toString().split("\\|")[0]);
        System.out.println(stringBuffer.toString());
        String str = "afdasfsdfa";

        System.out.println(str.split("\\|")[0]);

        String date = LocalDate.parse("2020-05-20", DateTimeFormatter.ofPattern("yyyy-MM-dd")).toString();

        System.out.println(date);

    }

}

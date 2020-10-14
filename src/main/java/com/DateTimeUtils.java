package com;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zwh.plan.demo.highio.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author DateTimeUtils
 * @version v1.0
 * @date 2019/8/14 14:32
 * @work //TODO
 */
@Slf4j
public class DateTimeUtils {


    @Test
    public void test() {

        LocalDateTime localDateTime = LocalDateTime.now().minusHours(2L);
        log.info("time:{}", localDateTime);

    }


    @Test
    public void test2() {

        for (int i = 0; i < 10; i++) {
            System.out.println("1");
            throw new RuntimeException("运行时异常");
        }


    }

    @Test
    public void test3() {

        double f = 0.5585;
        BigDecimal b = new BigDecimal(f);
        double f1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);
        System.out.println(Integer.parseInt(new DecimalFormat("0").format(f * 100)) + "%");//百分比没有小数点
        double result1 = 0.51111122111111;
        DecimalFormat df = new DecimalFormat("0.00%");
        String r = df.format(result1);
        System.out.println(r);//great
        NumberFormat num = NumberFormat.getPercentInstance();
        num.setMaximumIntegerDigits(3);
        num.setMaximumFractionDigits(2);
        double csdn = 0.55555555555555555;
        System.out.println(num.format(csdn));//good
        double result = 1;
        int temp = (int) (result * 1000);
        System.out.println(result + "%");//100%  变成了  100.0%


    }


    @Test
    public void test4() {
        System.out.println(LocalDateTime.now().with(LocalDate.MAX));
        System.out.println(LocalDateTime.now().with(LocalDate.MIN));

    }


    @Test
    public void test5() {

        String str = "{\n" +
                "\t\"smsType\": \"OTP\",\n" +
                "\t\"status\": \"1\",\n" +
                "\t\"sendDate\": \"2019-06-17 17:56:11\",\n" +
                "\t\"responseDescription\": \"Submitted successfully\",\n" +
                "\t\"smslist\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"mobile\": \"919217634228\",\n" +
                "\t\t\t\"serialno\": \"325211950306820096\",\n" +
                "\t\t\t\"result\": \"1\"\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";

        JSONObject jsonObject = JSONObject.parseObject(str);
        JSONArray jsonArray = jsonObject.getJSONArray("smslist");
        JSONObject smsList = jsonArray.getJSONObject(0);
        String serialno = smsList.getString("serialno");

    }


    @Test
    public void test7(){

        User user = new User();
        for(int i=0;i<1000;i++){
            user.setId(Long.valueOf(i));
            System.out.println("i:{"+i+"}"+user.getId());
        }
    }
}

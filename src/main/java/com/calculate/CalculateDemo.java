package com.calculate;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/10/12 14:46
 * @work //计算
 */
@Slf4j
public class CalculateDemo {


    /**
     * 位运算
     */
    @Test
    public void test() {
        //左移两位
        int num = 1 << 2;
/*
        1转为2进制是1，左移两位就是100，然后100转为十进制是2的2次方等于4
*/

        int num2 = 8 >> 2;
/*
        8转为2进制是1000，右移两位是10，转为十进制是2的1次方2
*/
        log.info("result:{}", num);

        log.info("result:{}",num2);
    }
}

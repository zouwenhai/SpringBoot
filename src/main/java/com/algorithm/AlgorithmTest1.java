package com.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/10/25 16:21
 * @work //算法测试1
 */
@Slf4j
public class AlgorithmTest1 {


    @Test
    public void test1() {
        StringBuffer str = new StringBuffer("暗示法 fasfda");
//        replace1(str);
        replace3(str);

    }

    /**
     * 替换字符串的空格为%20
     *
     * @param str
     */
    public void replace1(StringBuffer str) {
        long startTime = System.currentTimeMillis();
        String result = str.toString().replaceAll(" ", "%20");
        long endTime = System.currentTimeMillis();
        log.info("time:{}", endTime - startTime);
        log.info("str:{}", result);
    }


    /**
     * 替换字符串的空格为%20
     *
     * @param str
     */
    public void replace2(StringBuffer str) {
        long startTime = System.currentTimeMillis();
        String result = str.toString().replace(" ", "%20");
        long endTime = System.currentTimeMillis();
        log.info("time:{}", endTime - startTime);
        log.info("result:{}", result);
    }


    /**
     * 替换字符串的空格为%20
     *
     * @param str
     */
    public void replace3(StringBuffer str) {

        int i = str.length();
        log.info("length:{}", i);

    }
    
    @Test
    public void test2() {


    }

}

package com;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

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
    public void test(){

        LocalDateTime localDateTime = LocalDateTime.now().minusHours(2L);
        log.info("time:{}",localDateTime);

    }
}

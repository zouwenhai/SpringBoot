package com.jdk8feature.optional;

import org.junit.Test;

import java.util.Optional;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/11/27 12:55
 * @work //Optional的用法
 */
public class OptionalTest {


    @Test
    public void test() {
        RiskPolicyResFacade riskPolicyResFacade = new RiskPolicyResFacade();
        riskPolicyResFacade.setCode("0000");
     /*   RiskPolicyResFacade riskPolicyResFacade=null;*/
        System.out.println(!("0000").equals(Optional.ofNullable(riskPolicyResFacade).orElse( new RiskPolicyResFacade()).getCode()));

    }

}

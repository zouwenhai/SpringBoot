package com.jdk8feature.optional;


import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author:
 * @Description: 宁波风控结果
 * @Date: 下午4:15 2019/4/16
 * @Param:
 * @Return:
 */
@Data
public class RiskPolicyResFacade {
    /**
     * "0000" 为成功， 其他为不成功
     */
    private String Code;

    /**
     * 请求结果描述
     */
    private String Msg;

    /**
     * 决策建议"APPROVE"或者"REJECT"
     */
    private String Decision;

    /**期数*/
    private Integer Term;

    private RiskCreditResFacade riskCreditResFacade;

    @Data
    public class RiskCreditResFacade{
        /**
         * 授信额度
         */
        private BigDecimal creditQuota;

        /**
         * 可借金额
         */
        private String ableLoanAmount;

        /**
         * 可选天数
         */
        private String chooseDays;
    }


}
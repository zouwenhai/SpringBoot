package com.josn;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName CallRecordVo
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/9/8 21:24
 * @Version 1.0
 */
@Getter
@Setter
public class CallRecordVo implements Serializable {


    private static final long serialVersionUID = 2200688521007008242L;


    private String batchNo;

    private List<CallContentVo> callContent;

    private String callStatus;

    private String callStatusDesc;

    private String callTime;

    private String extend;

    private String groupCode;

    private String groupDesc;

    private String intent;

    private String orderNo;

    private String phone;

    private String talkTime;

    private String uuId;

    private Integer wordsTemplateId;

    private String wordsTemplatename;
}




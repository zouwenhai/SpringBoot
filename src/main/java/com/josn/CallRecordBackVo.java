package com.josn;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @ClassName CallRecordBackVo
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/9/8 21:38
 * @Version 1.0
 */
@Getter
@Setter
public class CallRecordBackVo implements Serializable {


    private static final long serialVersionUID = 2809502232568051079L;


    private CallRecordVo biz_data;


    private String notify_id;


    private String notify_time;


    private String sign;
}

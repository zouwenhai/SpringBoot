package com.test;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName CallRecord
 * @Description TODO
 * @Author zouwenhai
 * @Date 2020/3/17 22:25
 * @Version 1.0
 */

@Data
public class CallRecord {

    private String  id;

    private String phone;

    private Integer sipid;

    private String username;

    private String duration;

    private String start_time;

    private String end_time;

    private String orderid;

    private String show_phone;

    private String record_url;

    private String answer_time;

    private String direction;

    private String effective_called_number;

    private String hangup_cause;





}

package com.josn;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @ClassName CallContentVo
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/9/8 21:29
 * @Version 1.0
 */
@Getter
@Setter
public class CallContentVo implements Serializable {


    private static final long serialVersionUID = -3618505856308001811L;


    private String atext;

    private String btext;

    private Integer sort;


}

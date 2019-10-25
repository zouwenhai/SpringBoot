package com.jdk8feature.lambda;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/10/22 16:30
 * @work //TODO
 */
@Getter
@Setter
public class Teacher implements Serializable {

    private Long id;

    private String name;

    private Integer age;

    private Integer orderNum;


}

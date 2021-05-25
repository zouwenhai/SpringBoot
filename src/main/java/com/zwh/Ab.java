package com.zwh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zouwenhai
 * @date 2021/5/12 9:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
    public class Ab {

    private String id;

    private Integer age;

    private Integer type;


    private Integer errorType;

    public Ab(String id, Integer age, Integer type) {
        this.id = id;
        this.age = age;
        this.type = type;
    }
}

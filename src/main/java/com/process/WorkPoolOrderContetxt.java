package com.process;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/9/26 10:40
 * @work //TODO
 */
@Getter
@Setter
public class WorkPoolOrderContetxt {


    private String id;

    private String name;

    public WorkPoolOrderContetxt(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

package com.zwh.plan.entity;

import java.io.Serializable;

/**
 * @ClassName Entity
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/4/27 16:51
 * @Version 1.0
 */
public class Entity implements Serializable {

    private Integer uniqueKey;

    public Integer getUniqueKey() {
        return uniqueKey;
    }

    public void setUniqueKey(Integer uniqueKey) {
        this.uniqueKey = uniqueKey;
    }
}

package com.zwh.plan.demo.highio.entity;

import lombok.Data;

/**
 * @ClassName User
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/5/7 18:31
 * @Version 1.0
 */
@Data
public class User {
    private Long id; // 主键id
    private String username;// 用户名
    private String password;// 密码
    //省略getter和setter方法
}

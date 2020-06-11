package com.collect;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class User implements Serializable {

    private String userName;

    private String password;


    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}

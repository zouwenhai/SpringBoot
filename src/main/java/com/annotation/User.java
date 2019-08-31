package com.annotation;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/8/22 16:27
 * @work //TODO
 */
@Getter
@Setter
public class User {

    private Long id;

    private Role role;


    public User(Long id, Role role) {
        this.id = id;
        this.role = role;
    }

    public String getRoleValue() {
        Class c = this.role.getClass();
        CustomeAn customeAn = (CustomeAn) c.getAnnotation(CustomeAn.class);
        String roleName = customeAn.roleName();
        return roleName;
    }
}

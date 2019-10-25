package com.jdk8feature.lambda;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/9/26 13:52
 * @work //TODO
 */
@Getter
@Builder(toBuilder = true)
public class User {

    private Integer id;

    private String userName;

    private String password;
}

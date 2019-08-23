package com.annotation;

import java.lang.annotation.*;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/8/22 16:13
 * @work 自定义注解
 * @Target,@Retention,@Inherited,@Documented 这四个是对注解进行注解的元注解，负责自定义的注解的属性
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface CustomeAn {

String roleName();

int code() default 0;

}

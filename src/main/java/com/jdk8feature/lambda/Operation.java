package com.jdk8feature.lambda;

/**
 * @ClassName Operation
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/8/11 18:17
 * @Version 1.0
 */
@FunctionalInterface
public interface Operation<T, R> {

    R operation(T t1, T t2);
}

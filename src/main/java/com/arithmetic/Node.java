package com.arithmetic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


/**
 * @ClassName Node
 * @Description TODO
 * @Author zouwenhai
 * @Date 2020/3/22 15:51
 * @Version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
public class Node<T> {

    private T val;

    private Node<T> next;


}

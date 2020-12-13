package com.arithmetic;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName ListNode
 * @Description TODO
 * @Author zouwenhai
 * @Date 2020/3/21 23:06
 * @Version 1.0
 */
@Getter
@Setter
public class ListNode {

    private int val;

    private ListNode next;

    public ListNode(int val) {
        this.val = val;
    }


}

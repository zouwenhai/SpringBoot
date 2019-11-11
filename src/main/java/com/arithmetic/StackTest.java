package com.arithmetic;

import org.junit.Test;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/11/11 10:35
 * @work //TODO
 */
public class StackTest {


    @Test
    public void test() {

        StackClass stackClass = new StackClass(10);
        //入栈
        stackClass.push("1");
        stackClass.push("2");
        stackClass.push("3");
        stackClass.push("4");
        for(int i=0;i<4;i++){
            System.out.println(stackClass.pop());
        }

    }



    @Test
    public void test2(){

        StackBasedLinkedList stackBasedLinkedList = new StackBasedLinkedList();
        stackBasedLinkedList.push(1);
        stackBasedLinkedList.push(2);
        stackBasedLinkedList.push(3);
        stackBasedLinkedList.push(4);
        for(int i=0;i<4;i++){
            System.out.println(stackBasedLinkedList.pop());
        }


    }
}

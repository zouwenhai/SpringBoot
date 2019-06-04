package com.example.demo;

import org.junit.Test;

import java.util.*;

/**
 * @ClassName DemoCollection
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/5/11 21:19
 * @Version 1.0
 */
public class DemoCollection {


    @Test
    public void test() {
        Map mapa = new HashMap();
        List list = new ArrayList();
        List list2 = new LinkedList();
        Vector vector = new Vector();
        Stack<String> stack = new Stack<String>();
        stack.add("runner");
        stack.add("cmb");
        stack.add("horizon");
        stack.push("abcd");
        System.out.println(stack.peek());
        stack.pop();

        List linklist = new LinkedList();



        Set set = new HashSet();

        List list3 = new LinkedList();





    }
}

package com.example.demo;

import com.designmodel.prototype.ConcreteResume;
import com.designmodel.prototype.Resume2;
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


        Resume2 resume =new ConcreteResume();

        System.out.println("resume:{}"+resume);
        System.out.println("resume.hashCode():{}"+resume.hashCode());
        System.out.println("resume.hashCode():{}"+resume.toString());


        Map map = new HashMap();
        map.size();
        System.out.println(1<<4);

        Map map1  = new HashMap();
        Map map2 = new LinkedHashMap();
        Map map3 = new TreeMap();






    }



    @Test
    public void test2(){
        int e=100;
        Integer a=100;
        Integer b=100;
        Integer c=200;
        Integer d=200;
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(e==a);
        //

    }


    @Test
    public void test3(){
        int c=100;
        Integer a= new Integer(100);
        Integer b= new Integer(100);
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
        //

    }
}

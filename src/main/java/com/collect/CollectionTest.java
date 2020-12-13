package com.collect;

import org.junit.Test;

import java.util.*;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/9/16 16:52
 * @work //集合有关功能测试类
 */
public class CollectionTest {


    /**
     * ArrayList的排序
     */
    @Test
    public void test() {

        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        Collections.sort(num, (x, y) -> {//升序
            return x - y;
        });

        num.forEach(a -> {
            System.out.println(a);
        });

    }


    /**
     * trimToSize方法
     */
    @Test
    public void test1() {
        List a = new ArrayList();
        List b = new ArrayList(10);
        for (int i = 0; i < 11; i++) {
            b.add(i);
        }
        //去掉预留位置空间
        ((ArrayList) b).trimToSize();
    }


    @Test
    public void test2() {
        final int N = 1000000;
        Object obj = new Object();

        //没用调用ensureCapacity()方法初始化ArrayList对象
        ArrayList list = new ArrayList();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= N; i++) {
            list.add(obj);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("没有调用ensureCapacity()方法所用时间：" + (endTime - startTime) + "ms");

        //调用ensureCapacity()方法初始化ArrayList对象
        list = new ArrayList();
        startTime = System.currentTimeMillis();
        list.ensureCapacity(N);//预先设置list的大小
        for (int i = 0; i <= N; i++) {
            list.add(obj);
        }
        endTime = System.currentTimeMillis();
        System.out.println("调用ensureCapacity()方法所用时间：" + (endTime - startTime) + "ms");

    }


    @Test
    public void test3() {

        List<String> arrs = new ArrayList<>();
        arrs.add("a");
        arrs.add("b");
        arrs.add("c");
        arrs.add("d");
        arrs.add("e");
        arrs.add("f");
        arrs.add("h");
        arrs.add("i");
        arrs.add("j");
        Spliterator<String> a = arrs.spliterator();
        System.out.println(a);
        //此时结果：a:0-9（index-fence）

        Spliterator<String> b = a.trySplit();
        System.out.println(b.toString());
        //此时结果：b:4-9,a:0-4

        Spliterator<String> c = a.trySplit();
        //此时结果：c:4-6,b:4-9,a:6-9
        System.out.println(c.toString());

        Spliterator<String> d = a.trySplit();
        System.out.println(d.toString());
        //此时结果：d:6-7,c:4-6,b:4-9,a:7-9

    }


    /**
     * removeif方法根据条件过滤掉不需要元素
     */
    @Test
    public void test4() {

        List<Integer> b = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        b.add(1);
        //Arrays.asList得到的数组是java.util.Arrays.ArrayList，是自定义的内部类，没有实现add,remove等方法。而是直接调用java.util.AbstractList的add方法
        //  public void add(int index, E element) {
        //        throw new UnsupportedOperationException();
        //    }
        //但是父类方法没有实现，不支持。
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.removeIf(e -> e > 3);
        a.forEach(e -> System.out.println(e));

    }


    /**
     * 利用compareTo排序
     */
    @Test
    public void test5() {


        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(2);
        a.add(4);
        a.sort((x, y) -> x.compareTo(y));
        a.forEach(e -> {
            System.out.println(e);
        });

    }

}

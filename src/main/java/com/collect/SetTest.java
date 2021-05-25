package com.collect;

import org.junit.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set集合
 *
 * @author zouwenhai
 * @date 2021/5/25 16:01
 */
public class SetTest {


    @Test
    public void test1() {

        //等于0则相同，不等于0则不同
        Set treeSet = new TreeSet<SetEntity>(Comparator.comparing(SetEntity::getNum));
        //hashset去重原理是根据equals方法和hashcode方法
        Set hashSet = new HashSet();

        SetEntity setEntity1 = new SetEntity(1L, "1234");
        SetEntity setEntity2 = new SetEntity(2L, "1234");
        SetEntity setEntity3 = new SetEntity(3L, "123");
        treeSet.add(setEntity1);
        treeSet.add(setEntity2);
        treeSet.add(setEntity3);

        hashSet.add(setEntity1);
        hashSet.add(setEntity2);
        hashSet.add(setEntity3);


    }
}

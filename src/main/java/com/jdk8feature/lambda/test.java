package com.jdk8feature.lambda;

import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @ClassName test
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/8/11 18:19
 * @Version 1.0
 */
public class test {


    public void op(Long l1, Long l2, Operation<Long, Long> operation) {
        System.out.println(operation.operation(l1, l2));
    }

    /**
     * 写具体实现方法再直接使用
     */
    @Test
    public void test() {

        op(10L, 10L, (x, y) -> x * y);


        /**
         *等价于（x,y）->x*y
         */
        Operation op = new Operation() {
            @Override
            public Object operation(Object t1, Object t2) {
                return (Long.parseLong(t1.toString()) * Long.parseLong(t2.toString()));
            }
        };


    }


    /**
     * 先使用lambda表达具体的实现方法体，在进行接口中方法的调用，传入具体的值。
     */

    @Test
    public void test2() {
        //先写实现方法体
        Operation<Integer, Integer> operation = (x, y) -> x * y;
        //再调用
        System.out.println(operation.operation(10, 10));

    }


    /****
     * Java内置的四大核心函数式接口
     */


    public void consume(Integer n, Consumer<Integer> consumer) {

        consumer.accept(n);

    }

    /**
     * 消费型接口  消费对象
     */

    @Test
    public void testConsumer() {

        consume(1, (d) -> System.out.println(d));


    }


    //调用此方法时，第二个参数提供一个数字集合
    public List<Integer> getNumList(int n, Supplier<Integer> sup) {
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numList.add(sup.get()); //通过get方法得到数字 存到numList
        }
        return numList;

    }

    /**
     * 供给型接口 Supplier<Integer> sup
     */

    @Test
    public void testSupplier() {

        List<Integer> numList = getNumList(10, () -> (int) (Math.random() * 100));
        numList.forEach(number -> {
            System.out.println(number);
        });
    }


    /**
     * @param str
     * @param function Function<R,T> 函数型接口 指定特定功能
     * @return
     */

    public String handleStr(String str, Function<String, String> function) {
        return function.apply(str);


    }


    /**
     * 将字符串边小写
     */
    @Test
    public void testFunction() {

        System.out.println(handleStr("ADADADDA", (d) -> d.toLowerCase()));
    }


    /**
     * @param strs
     * @param predicate Predicate<T> 条件判断 boolean test(T t); 返回boolean
     * @return
     */
    public List<String> strFilter(List<String> strs, Predicate<String> predicate) {
        List<String> list = new ArrayList<>();
        strs.forEach(str -> {
            if (predicate.test(str)) {

                list.add(str);
            }
        });
        return list;


    }


    @Test
    public void testPredicate() {
        //过滤出字符串长度大于3的字符
        List<String> s1 = strFilter(Arrays.asList("hangg", "afafa", "132", "112fsf"), (x) -> x.length() > 3);
        System.out.println(s1);
    }


    /**
     * 测试集合过滤方法
     */
    @Test
    public void testFilter() {
        List<Person> persons = Arrays.asList(new Person(1, "system", "1"), new Person(2, "jack", "1"), new Person(3, "tom", "1"));
        //过滤转为新的集合
        List<Person> newList = persons.stream().filter(person -> person.getId() > 2).collect(Collectors.toList());
        newList.stream().forEach(ele -> {
            System.out.println(ele.getId());
        });
        //
        Map<Integer, Person> map = persons.stream().filter(person -> person.getId() > 1).collect(Maps::newHashMap, (hashMap, person) -> hashMap.put(person.getId(), person), Map::putAll);
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }

    }

    /**
     * 双冒号运算符
     */
    public void testMaohao() {


    }
}

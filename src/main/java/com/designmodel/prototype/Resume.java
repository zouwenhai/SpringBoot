package com.designmodel.prototype;

import java.util.Arrays;

/**
 * @ClassName Resume
 * @Description 简历（原型模式）
 * @Author zouwenhai
 * @Date 2019/5/19 14:36
 * @Version 1.0
 */
public class Resume implements Cloneable {

    private String name;

    private int age;

    private String[] hobby;

    public Resume() {
        System.out.println("调用无参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}

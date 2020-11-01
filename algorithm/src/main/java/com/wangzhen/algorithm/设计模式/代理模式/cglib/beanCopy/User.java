package com.wangzhen.algorithm.设计模式.代理模式.cglib.beanCopy;

/**
 * Description:
 * Datetime:    2020/10/31   5:42 下午
 * Author:   王震
 */
public class User {
    String name;
    int age;
    String phone;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

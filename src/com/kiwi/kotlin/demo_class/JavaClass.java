package com.kiwi.kotlin.demo_class;

import sun.applet.Main;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: JavaClass
 * Author:   kiwilss
 * Date:     2018/4/20 11:28
 * Description: java里面类和属性
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class JavaClass {

    private String name;
    private int age;

    public JavaClass(String name, int age) {
        this.name = name;
        this.age = age;
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

    public static void main(String[] args) {
        Person person = new Person("kitty");
        System.out.println(person.getName());
    }

}

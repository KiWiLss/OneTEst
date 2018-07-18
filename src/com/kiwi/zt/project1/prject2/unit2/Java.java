package com.kiwi.zt.project1.prject2.unit2;



/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Java
 * Author:   kiwilss
 * Date:     2018/7/17 15:57
 * Description: java
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class Java {

    public static String name(Animal animal){
        return "animal";
    }

    public static String name(Dog dog){
        return "dog";
    }

    public static void printName(Animal animal1 ,Dog animal2){
        String name = name(animal1);
        System.out.println(name);
        String name2 = name(animal2);
        System.out.println(name2);
    }

    public static void main(String[] args) {
        printName(new Dog(),new Dog());
    }
}

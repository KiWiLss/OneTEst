package com.kiwi.kotlin3.java;

import com.kiwi.kotlin3.demo_fun_two.ExtendKt;
import com.kiwi.kotlin3.demo_fun_two.SetTestKt;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Person
 * Author:   kiwilss
 * Date:     2018/5/14 14:49
 * Description: person
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(4);
        list.add(4);
        String result = SetTestKt.joinToString2(list, ";", "{", "}");
        System.out.println(result);
        char kotlin = ExtendKt.lastChar("kotlin");


        byte b=1;


    }

    <T extends Number> T sum(List<T> list){
        return null;
    }
}




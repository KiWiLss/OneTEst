package com.kiwi.jujy;

import com.kiwi.jujy.one.class_attribute.Person;
import com.kiwi.jujy.two.open.ViewKt;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: JavaTest
 * Author:   kiwilss
 * Date:     2018/7/18 09:24
 * Description: java test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class JavaTest {


    /**
     * @param args
     */
    public static void main(String[] args) {
        //java中使用person类
        Person bob = new Person("bob", true);
        System.out.println(bob.getName());
        System.out.println(bob.isMarried());

        //调用kotlin的扩展属性
        char kotlin = ViewKt.getLastChar(new StringBuilder("kotlin"));
        System.out.println(kotlin);


        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(5);
        set.add(3);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }


}

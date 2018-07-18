package com.kiwi.jujy;

import com.kiwi.jujy.one.class_attribute.Person;

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


    }


}

package com.kiwi.kotlin2.demo_java_kotlin;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: HelloJava
 * Author:   kiwilss
 * Date:     2018/4/27 15:37
 * Description: java
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class HelloJava {
    public static void main(String[] args) {
        User user = new User(9, null);
        System.out.println(user);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}

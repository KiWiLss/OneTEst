package com.kiwi.kotlin2.demo_java_kotlin;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: ConsoleJava
 * Author:   kiwilss
 * Date:     2018/4/27 16:10
 * Description: java
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class ConsoleJava {
    public static void main(String[] args) {
        for (String arg : args) {
            String[] split = arg.split("_");
            for (String s : split) {
                System.out.print(s);
                System.out.print(" ");
            }
        }
    }
}

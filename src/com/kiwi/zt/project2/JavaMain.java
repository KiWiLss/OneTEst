package com.kiwi.zt.project2;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: JavaMain
 * Author:   kiwilss
 * Date:     2018/9/12 21:10
 * Description: java main
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class JavaMain {
    public static int in = 9;//关键字冲突

    public static void main(String[] args) {
        testClass(JavaMain.class);
        System.out.println(JavaMain.class);
    }

    public static void testClass(Class<JavaMain> clazz){
        System.out.println(clazz.getSimpleName());
    }
}

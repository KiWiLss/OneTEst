package com.kiwi.kotlin.demo_string;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: StringTest
 * Author:   kiwilss
 * Date:     2018/4/24 14:30
 * Description: java方法string类型测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class StringTest {
    public static void main(String[] args) {

        String resource = "12.345-6.A";
        //使用转义
        String[] split = resource.split("\\.");
        for (int i = 0,j=split.length ; i < j; i++) {
            System.out.println(split[i]);
        }

    }
}

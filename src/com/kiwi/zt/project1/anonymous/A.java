package com.kiwi.zt.project1.anonymous;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: A
 * Author:   kiwilss
 * Date:     2018/7/17 13:49
 * Description: java a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class A {

    public static String format(String string){
        return string.isEmpty() ? null : string;
    }


    public static void main(String[] args) {
        KUtils.sayMessage(null);
        KUtils.INSTANCE.sayMessage(null);
    }

}

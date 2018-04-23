package com.kiwi.kotlin.demo_fun_two;

import sun.applet.Main;

import java.util.*;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: FunTest
 * Author:   kiwilss
 * Date:     2018/4/23 11:44
 * Description: 函数的声明和调用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class FunTest {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(7);
        set.add(8);
        set.add(2);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //调用kotlin的扩展函数
        char a = ExtendFunKt.lastChar("Android");
        System.out.println(a);


    }

    public static <T>String joinToString(Collection<T>collection,
                                         ArrayList<T> list,
                                         String separaor,String prefix,String postfix){

        String sb = new String();
        sb.concat("h");
        return "";
    }

    public void funOver(){
        System.out.println("简单方法");
    }
}

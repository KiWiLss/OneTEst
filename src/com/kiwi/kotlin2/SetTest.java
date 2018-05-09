package com.kiwi.kotlin2;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: SetTest
 * Author:   kiwilss
 * Date:     2018/5/8 10:40
 * Description: set test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class SetTest {


    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("--------------");
        for (String s : set) {
            System.out.println(s);
        }
    }
}

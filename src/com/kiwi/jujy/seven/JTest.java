package com.kiwi.jujy.seven;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

import java.util.ArrayList;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: JTest
 * Author:   kiwilss
 * Date:     2018/8/2 15:52
 * Description: j test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class JTest {
    public static void main(String[] args) {
        KotlinTestKt.processTheAnswer(new Function1<Integer, Integer>() {
            @Override
            public Integer invoke(Integer integer) {
                return integer+1;
            }
        });

        KotlinTestKt.processTheAnswer(number -> number +1);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("42");
        CollectionsKt.forEach(strings, s ->{
                System.out.println(s);
                    return Unit.INSTANCE;
                }
        );

    }
}

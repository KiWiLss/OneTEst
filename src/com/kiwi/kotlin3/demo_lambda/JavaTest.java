package com.kiwi.kotlin3.demo_lambda;

import kotlin.jvm.functions.Function1;
import sun.applet.Main;

import static com.kiwi.kotlin3.demo_lambda.FunKt.processTheAnswer;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: JavaTest
 * Author:   kiwilss
 * Date:     2018/5/23 11:53
 * Description: java test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class JavaTest {


    public static void main(String[] args) {
        processTheAnswer(new Function1<Integer, Integer>() {
            @Override
            public Integer invoke(Integer integer) {
                return integer+1;
            }
        });


    }
}

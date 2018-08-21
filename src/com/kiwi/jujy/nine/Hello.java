package com.kiwi.jujy.nine;

import java.util.Random;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Hello
 * Author:   kiwilss
 * Date:     2018/8/3 14:29
 * Description: hello
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class Hello {

    @Deprecated
    public void say(){
        System.out.println("nothing has to say");
    }

    public void speak(){
        System.out.println("speak");
    }

    public static void main(String[] args) {

        double random = Math.random();//范围[0,1),左闭右开
        System.out.println("Math.Random-->"+random);
        int v = (int) (random * 3);
        System.out.println(v);

        System.out.println("--------------------");
        Random rand =new Random(25);
        int i2;
        i2=rand.nextInt(100);
        System.out.println(i2);

        System.out.println("--------------------");
        // 对于种子相同的Random对象，生成的随机数序列是一样的。
        Random ran1 = new Random(10);
        System.out.println("使用种子为10的Random对象生成[0,10)内随机整数序列: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(ran1.nextInt(10) + " ");
        }

    }

}

package com.kiwi.zt.project1.anonymous;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: BirdTest
 * Author:   kiwilss
 * Date:     2018/7/17 11:38
 * Description: main test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class BirdTest {
    public void test(Brid brid){
        System.out.println(brid.getName()+"能够飞"+brid.fly()+"远");
    }

    public static String in = "in";

    public static void main(String[] args) {
        BirdTest birdTest = new BirdTest();

        birdTest.test(new Brid() {
            @Override
            public int fly() {
                return 100;
            }

            @Override
            public String getName() {
                return "大雁";
            }
        });



    }
}

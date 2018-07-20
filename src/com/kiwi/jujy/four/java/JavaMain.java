package com.kiwi.jujy.four.java;


import com.kiwi.jujy.two.open.View;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: JavaMain
 * Author:   kiwilss
 * Date:     2018/7/20 13:41
 * Description: java main
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class JavaMain {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("click");
            }
        });

        button.setOnClickListener(v -> {
            System.out.println("lambda click");
        });
    }
}

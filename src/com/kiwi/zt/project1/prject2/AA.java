package com.kiwi.zt.project1.prject2;

import com.kiwi.zt.project1.AInterface;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: AA
 * Author:   kiwilss
 * Date:     2018/9/12 21:23
 * Description: aa
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class AA implements AInterface {

    public static final AA a = new AA();

    @Override
    public void putNumber(int num) {
        System.out.println("int");
    }

    @Override
    public void putNumber(Integer num) {
        System.out.println("integer");
    }


    public static String format(String string){
        return string.isEmpty() ? null : string;
    }
}

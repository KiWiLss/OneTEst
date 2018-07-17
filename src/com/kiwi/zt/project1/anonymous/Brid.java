package com.kiwi.zt.project1.anonymous;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Brid
 * Author:   kiwilss
 * Date:     2018/7/17 11:36
 * Description: bird
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public abstract class Brid {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int fly();

    public void sayMessage(String msg){
        System.out.println(msg);
    }

    public void sayMessage(Brid brid){}


}

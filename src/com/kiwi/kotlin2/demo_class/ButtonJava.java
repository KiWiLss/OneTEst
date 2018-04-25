package com.kiwi.kotlin2.demo_class;

import org.jetbrains.annotations.NotNull;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: ButtonJava
 * Author:   kiwilss
 * Date:     2018/4/25 14:12
 * Description: button java
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class ButtonJava implements View,Clickable{

    public static void main(String[] args) {



    }

    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {

    }

    @Override
    public void click() {

    }

    @Override
    public void showOff() {

    }

    //内部类
    public class ButtonState implements State{

    }
}

package com.kiwi.kotlin2.demo_interface.nesting;

import org.jetbrains.annotations.NotNull;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Button
 * Author:   kiwilss
 * Date:     2018/5/7 16:02
 * Description: button
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class Button implements View{

    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {

    }

     private static class ButtonState implements State{

    }
}

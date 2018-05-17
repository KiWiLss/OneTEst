package com.kiwi.kotlin3.demo_class;

import org.jetbrains.annotations.NotNull;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: JavaButton
 * Author:   kiwilss
 * Date:     2018/5/17 09:51
 * Description: java button
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class JavaButton implements View{


    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {

    }


    public class ButtonState implements State{
        public void getOuter(){
            JavaButton javaButton = new JavaButton();

        }
    }
}

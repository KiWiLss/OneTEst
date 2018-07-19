package com.kiwi.jujy.three;

import com.kiwi.jujy.three.interface_kotlin.State;
import com.kiwi.jujy.three.interface_kotlin.View;
import org.jetbrains.annotations.NotNull;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: ButtonJava
 * Author:   kiwilss
 * Date:     2018/7/19 10:44
 * Description: java button
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class ButtonJava implements View {
    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {

    }
    //内部类,存储外部类的引用
    public class ButtonState implements State{

        public ButtonJava getOuter(){
            return ButtonJava.this;
        }
    }
    //嵌套类,不存储外部类的引用
    public static class ButtonStatic implements State{

        public ButtonJava getStatic(){
            return new ButtonJava();
        }

    }


}

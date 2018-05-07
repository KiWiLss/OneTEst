package com.kiwi.kotlin2.demo_interface.nesting

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: ButtonKotlin
 * Author:   kiwilss
 * Date:     2018/5/7 16:05
 * Description: bk
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class ButtonKotlin : View {

    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    class ButtonState : State{

    }
}
package com.kiwi.kotlin2.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: ButtonKotlin
 * Author:   kiwilss
 * Date:     2018/4/25 14:21
 * Description: button kotlin
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class ButtonKotlin : View {
    override fun getCurrentState(): State {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return ButtonState()
    }

    override fun restoreState(state: State) {
        super.restoreState(state)
    }
    //内部类,这个类与java中的静态嵌套类类似
    class ButtonState : State{
    }

}
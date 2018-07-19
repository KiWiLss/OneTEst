package com.kiwi.jujy.three.interface_kotlin

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: ButtonKotlin
 * Author:   kiwilss
 * Date:     2018/7/19 10:54
 * Description: button kotlin
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class ButtonKotlin : View {
    override fun restoreState(state: State) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCurrentState(): State {
        return ButtonState()
    }

     class ButtonState : State


}


class Outer{
    //内部类,存储外部类的引用
    inner class Inner{
        fun getOuterReference() : Outer = this@Outer
    }
}


class Outer2{
    //静态类,嵌套类,不存储外部类的引用
    class Inner{
        fun getOuter(): Outer2 = Outer2()
    }
}
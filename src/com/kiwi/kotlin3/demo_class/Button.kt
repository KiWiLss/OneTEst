package com.kiwi.kotlin3.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Button
 * Author:   kiwilss
 * Date:     2018/5/17 10:01
 * Description: button
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class ButtonKotlin : View {
    override fun getCurrentState(): State {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return ButtonStatee()
    }


    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    class ButtonStatee : State{

    }
}

fun main(args: Array<String>) {

}


class Outer{
    inner class Inner{
        fun getOuterReference() : Outer = this@Outer
    }
}
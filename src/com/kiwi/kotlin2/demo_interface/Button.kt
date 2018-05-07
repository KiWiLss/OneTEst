package com.kiwi.kotlin2.demo_interface



/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Button
 * Author:   kiwilss
 * Date:     2018/5/7 14:27
 * Description: button
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Button : Clickable {
    override fun click() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("click")
    }

    //可以直接调用,也可以重写
    override fun showOff() {
        //super.showOff()
        println("change i'm clickable")
    }

}

fun main(args: Array<String>) {
    Button().click()
    Button().showOff()
}

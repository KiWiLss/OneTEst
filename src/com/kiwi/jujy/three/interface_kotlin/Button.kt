package com.kiwi.jujy.three.interface_kotlin

import com.kiwi.jujy.three.Clickable

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Button
 * Author:   kiwilss
 * Date:     2018/7/19 09:56
 * Description: button
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Button : Clickable ,Focusable{
    override fun showOff() {
        //super<Clickable>.showOff()
        println("button showoff")
    }

    override fun click() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("i was clicked")
    }


}


fun main(args: Array<String>) {
    Button().click()
    Button().showOff()
}
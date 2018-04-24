package com.kiwi.kotlin2.demo_class



/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Button
 * Author:   kiwilss
 * Date:     2018/4/24 16:19
 * Description: button
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Button : Clickable {
    override fun click() = println("i was clicked")

//     override fun showOff() {
//        super.showOff()
//    }
}

fun main(args: Array<String>) {
    Button().click()
    Button().showOff()
}
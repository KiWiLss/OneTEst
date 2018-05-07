package com.kiwi.kotlin2.demo_interface

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Button2
 * Author:   kiwilss
 * Date:     2018/5/7 14:41
 * Description: button
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Button2 : Clickable,Focusable {
    //两个接口有相同函数名的默认方法,不做处理,一个都不执行
    override fun showOff() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

    override fun click() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("i'm one click")
    }
}

fun main(args: Array<String>) {
    Button2().click()
    Button2().showOff()

}
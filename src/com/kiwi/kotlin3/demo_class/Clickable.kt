package com.kiwi.kotlin3.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Clickable
 * Author:   kiwilss
 * Date:     2018/5/16 16:42
 * Description: clickable
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface Clickable {
    //普通的声明方法
    fun click()
    //默认实现方法
    fun showOff() = println("i'm clickable!")


}


class Button : Clickable {
    override fun click() {
        println("i was clicked")
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

interface Focusable{
    fun setFocus(b:Boolean) = println("i ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("i'm focusable!")
}

class Button2 : Clickable,Focusable {
    override fun showOff() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        super<Focusable>.showOff()
        super<Clickable>.showOff()
    }

    override fun click() {
        println("i was click")
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main(args: Array<String>) {

    Button().click()
    Button().showOff()
    println("---------")
    val button2 = Button2()
    button2.click()
    button2.showOff()
}


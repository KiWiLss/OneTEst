package com.kiwi.jujy.two.open




/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: View
 * Author:   kiwilss
 * Date:     2018/7/18 17:13
 * Description: view
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
open class View {
    open fun click() = println("View clicked")

    fun longClick() = println("View long click")
}
//不可重写的扩展函数
fun View.showOff() = println("i'm a view")

fun Button.showOff() = println("i'm a button")

class Button : View(){
    override fun click() = println("button clicked")
}


//声明一个扩展属性
val String.lastChar : Char
get() = get(length-1)

//可变扩展属性
var StringBuilder.lastChar : Char
get() = get(length-1)
set(value: Char){
    this.setCharAt(length-1,value)
}






fun main(args: Array<String>) {
    val button:View = Button()
    button.click()
    button.showOff()

    println("kotlin".lastChar)

    val sb = StringBuilder("kotlin?")
    println(sb.lastChar)
    sb.lastChar='!'
    println(sb)


    val listOf: List<String> = listOf("first", "second", "fourtenth")
    println(listOf.last())


    val numbers = setOf(1, 14, 2)
    println(numbers.max())
}
package com.kiwi.kotlin3.demo_fun_two

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: View
 * Author:   kiwilss
 * Date:     2018/5/15 15:29
 * Description: view
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
open class View{
    open fun click() = println("View clicked")
}

class Button: View(){
    override fun click() {
        //super.click()
        println("Button click")
    }
}

fun View.showOff() = println("i'm a view!")

fun Button.showOff() = println("i'm a button!")

fun main(args: Array<String>) {

    val button = Button()
    button.click()
    button.showOff()

    val view:View = Button()
    view.click()
    view.showOff()


    val list = listOf("args:", *args)
    println(list)

    //中缀调用
    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    //遍历map
    for ((index,element) in map){
        println(index)
        println(element)
    }

    println("---------------")
    println("12.345-6.A".split("\\.|-".toRegex()))
    //指定多个分隔符
    println("12.345-6.A".split(".","-"))

    val path = "/Users/yole/kotlin-book/chapter.adoc"
    parsePath(path)


}

fun parsePath(path:String){
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir:$directory ,name:$fullName ,filename:$fileName ,ext:$extension")
}



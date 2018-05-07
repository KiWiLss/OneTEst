package com.kiwi.kotlin2.demo_interface

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Talkative2
 * Author:   kiwilss
 * Date:     2018/5/7 15:47
 * Description: talkative
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
open class Talkative2{
    private fun yell() = println("yell")

    protected fun whisper() = println("Let's talk!")

    fun publicFun() = println("public fun")

    init {
        println("init")
    }
}

//扩展方法
fun Talkative2.giveSpeech(){
    //yell()
    //只能访问public方法
    publicFun()

}

fun main(args: Array<String>) {
    Talkative2().giveSpeech()
}
package com.kiwi.kotlin2.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: TalkativeButton
 * Author:   kiwilss
 * Date:     2018/4/25 11:56
 * Description: 可见性修饰符
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

internal open class TalkativeButton : Focusable{

    private fun yell() =  println("Hey!")

    protected fun whisper() = println("Let's talk!")

}
//public成员暴露了其internal接收者类型TalkativeButton

 internal fun TalkativeButton.giveSpeech(){

     println("give speech")

     //private ,protected修饰方法无法访问
//    yell()
//
//    whisper()

}

fun main(args: Array<String>) {
    TalkativeButton().giveSpeech()

}
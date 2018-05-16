package com.kiwi.kotlin3.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: TalkativeButton
 * Author:   kiwilss
 * Date:     2018/5/16 17:51
 * Description: talkative
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
internal open class TalkativeButton : Focusable{

    private fun yell() = println("hey!")

    protected fun whisper() = println("let's talk!")

    fun publickFun() = println("test public fun!")
}


fun giveSpeech(){

}

internal class TestFun : TalkativeButton(){

}
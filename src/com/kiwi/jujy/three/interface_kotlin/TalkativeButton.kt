package com.kiwi.jujy.three.interface_kotlin

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: TalkativeButton
 * Author:   kiwilss
 * Date:     2018/7/19 10:29
 * Description: talkative button
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
internal open class TalkativeButton : Focusable{

    private fun yell() = println("hey!")

    protected fun whisper() = println("let's talk")

}

internal fun TalkativeButton.giveSpeech(){

    //扩展函数不能调用private和protected成员

}
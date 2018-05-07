package com.kiwi.kotlin2.demo_interface

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: TalkativeButton
 * Author:   kiwilss
 * Date:     2018/5/7 15:36
 * Description: talkative
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
internal open class TalkativeButton : Focusable{

    private fun yell() = println("hey!")

    protected fun whisper() = println("Let's talk!")


}

//fun TalkativeButton.giveSpeech(){
//
//}
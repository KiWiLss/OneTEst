package com.kiwi.kotlin2.demo_interface.interface_variable

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: LengthCounter
 * Author:   kiwilss
 * Date:     2018/5/8 10:12
 * Description: lengthcounter
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class LengthCounter{
    var counter:Int = 0
    private set

    fun addWord(word:String){
        counter+=word.length
    }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("hi!")
    //lengthCounter.counter=9
    println(lengthCounter.counter)
}
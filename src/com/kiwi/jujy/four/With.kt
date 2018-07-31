package com.kiwi.jujy.four

import javax.naming.Context

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: With
 * Author:   kiwilss
 * Date:     2018/7/20 14:22
 * Description: with
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    println(alphabet())

    println(alphabet2())

    println(alphabet3())

    println(alphabet4())

    println(alphabet5())
}


fun alphabet5() = buildString {
    for (letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow i know the alphabet!")
}

fun createViewWithCustomAttributes(context: Context) =
        println("---")


fun alphabet4() = StringBuilder().apply {
    for (letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow i know the alphabet!")
}.toString()


fun alphabet3() = with(StringBuilder()){
    for (letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow i know alphabet!")
    this@with.toString()
    //toString()
    //this.toString()
}

 fun StringBuilder.toString() : String{
    return "hello"
}

fun alphabet2(): String  {
    val result = StringBuilder()
    return with(result){
        for (letter in 'A'..'Z'){
            result.append(letter)
        }
        append("\nNow i know the alphabet!")
        toString()
    }
}

fun alphabet() : String{
    val result = StringBuilder()
    for (letter in 'A'..'Z'){
        result.append(letter)
    }
    result.append("\n Now i know the alphabet!")
    return result.toString()
}
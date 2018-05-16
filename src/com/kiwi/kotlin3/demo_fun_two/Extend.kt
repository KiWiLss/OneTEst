package com.kiwi.kotlin3.demo_fun_two

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Extend
 * Author:   kiwilss
 * Date:     2018/5/15 15:01
 * Description: 扩展函数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {

    println("Kotlin".lastChar())

    val list = listOf(1, 4, 5)
    println(list.joinToString())



}

fun String.lastChar():Char = this.get(this.length-1)

/**
 * 作为扩展函数的工具函数
 */
fun <T>Collection<T>.joinToString(separator:String=";",
                                  prefix:String="{",postfix:String="}"):String{
    val result = StringBuilder(prefix)
    for ((index,element) in this.withIndex()){
        if (index>0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

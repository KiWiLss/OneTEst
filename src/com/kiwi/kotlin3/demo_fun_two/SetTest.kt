package com.kiwi.kotlin3.demo_fun_two

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: SetTest
 * Author:   kiwilss
 * Date:     2018/5/15 11:49
 * Description: set
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {

    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)

    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)//javaClass等价于java的getClass()

    val strings = listOf("first", "second", "fourteenth")
    println(strings.last())

    val numbers = setOf(1, 14, 2)
    println(numbers.max())

    println(joinToString(list,";","[","]"))

    println(joinToString2(list))

    println("Kotlin".lastChar())
}

/**
 * 声明顶层属性
 */
var opCount = 0
fun performOperation(){
    opCount++;
}

val UNIX_LINE_SEPARATOR = "\n"
/**
 * 静态常量
 */
const val UNIX_LINE_SEPARATOR2 ="\n"

fun reportOperationCount(){
    println("Operation performed $opCount times")
}

/**
 * 默认参数值
 */

fun <T>joinToString2(collection: Collection<T>,separator: String=";"
        ,prefix: String="{",postfix: String="}"):String{
    val sb = StringBuilder(prefix)
    for ((index,element) in collection.withIndex()){
        if (index>0) sb.append(separator)
        sb.append(element)
    }
    sb.append(postfix)
    return sb.toString()
}

fun <T>joinToString(collection:Collection<T>,separator:String,prefix:String,postfix:String):String{
    val sb = StringBuilder(prefix)
    for ((index,element) in collection.withIndex()){
        if (index>0) sb.append(separator)
        sb.append(element)
    }
    sb.append(postfix)
    return sb.toString()
}
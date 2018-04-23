package com.kiwi.kotlin.demo_fun_two

import strings.joinToString3


/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: FunTestTwo
 * Author:   kiwilss
 * Date:     2018/4/23 14:03
 * Description: 函数练习
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
//顶层属性
var mOpCount = 0

fun main(args: Array<String>) {
    val listOf = listOf(1, 2, 3)
    println(listOf)//触发toString()的调用

    println(joinToString(listOf,";","{","}"))
    //调用一个函数时,可以显示的显示参数的名称
    println(joinToString(collection = listOf,separator = ";",
            prefix = "{",postfix = "}"))

    //可以用所有参数来调用,或是省略部分参数,常规语法,可以省略的只有末尾的参数
    println(joinToString2(listOf,"["))
    //使用命名参数,可以任意省略
    println(joinToString2(listOf,prefix = "(",postfix = ")"))

    joinToString3(listOf)
    println("----------------------------")
    val joinToString3 = listOf.joinToString3()
    println(joinToString3)
}

/**
 * 对一个集合进行修改,使得打印出符号要求的String字符串
 * separator,分隔符
 * prefix前缀
 * postfix后缀
 */
fun <T> joinToString(collection: Collection<T>,separator:String
    ,prefix: String ,postfix:String) : String {
    val sb = StringBuilder(prefix)
    for ((index,element) in collection.withIndex()){
        if (index > 0) sb.append(separator)
        sb.append(element)
    }
    sb.append(postfix)
    return sb.toString()
}
/**
 * 对一个集合进行修改,使得打印出符号要求的String字符串
 * 声明一个有默认值的参数
 * separator,分隔符
 * prefix前缀
 * postfix后缀
 */
fun <T>joinToString2(collection: Collection<T>,
                     separator: String =";",prefix: String = "{"
                    ,postfix: String= "}") : String {
    val sb = StringBuilder(prefix)
    for ((index,element) in collection.withIndex()){
        if (index > 0) sb.append(separator)
        sb.append(element)
    }
    sb.append(postfix)
    return sb.toString()
}

fun <T>Collection<T>.joinToString3(separator: String="-"
,prefix: String="*",postfix: String="*") :String{
    val sb = StringBuilder(prefix)
    for ((index,element) in this.withIndex()){
        if (index > 0) sb.append(separator)
        sb.append(element)
    }
    sb.append(postfix)
    return sb.toString()
}
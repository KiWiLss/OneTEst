package com.kiwi.jujy.two

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: join
 * Author:   kiwilss
 * Date:     2018/7/18 16:24
 * Description: join
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
//fun joinToString(...) : String { ... }

//声明顶层属性
var opCount = 0
//常量
val UNIX_LINE_SEPARATOR = "\n"

fun performOperation(){
    opCount++//改变属性的值
}

fun reportOperationCount(){
    //读取属性的值
    println("Operation performed $opCount times")
}

//扩展函数
fun String.lastChar() : Char = this.get(this.length-1)

fun String.lastChar2() : Char = get(length-1)

fun <T>Collection<T>.joinToString(separator: String = "",
                                  prefix: String = "{",
                                  postfix: String = "}") : String{
    val sb = StringBuilder(prefix)
    for ((index,element) in withIndex()){
        if (index > 0){
            sb.append(separator)
        }
        sb.append(element)
    }
    sb.append(postfix)
    return sb.toString()
}

fun Collection<String>.join(separator: String = ",",
                            prefix: String = "[",
                            postfix: String = "]")
        = joinToString(separator,prefix,postfix)

fun main(args: Array<String>) {

    println("java".lastChar())
    val list = listOf(1, 2, 3)
    println(list.joinToString("&"))

    val stringList = listOf("1", "4", "34")
    println(stringList.join())

}
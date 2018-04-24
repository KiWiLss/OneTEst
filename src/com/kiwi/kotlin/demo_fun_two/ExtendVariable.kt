package com.kiwi.kotlin.demo_fun_two

import sun.font.AttributeValues

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: ExtendVariable
 * Author:   kiwilss
 * Date:     2018/4/23 16:58
 * Description: 扩展属性
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


class ExtendVariable{

}
//自定义属性
var StringBuilder.lastChar : Char
    get() = get(length-1)
    set(value : Char) {
        this.setCharAt(length-1,value)
    }
fun main(args: Array<String>) {

    val stringBuilder = StringBuilder("Android")
    println(stringBuilder.lastChar)
    stringBuilder.lastChar='!'
    println(stringBuilder.lastChar)

    val list = listOf("args:", *args)
    println(list)

    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    val (number,name) = 1 to "one"


}


infix fun Any.to(other:Any) = Pair(this,other)

//fun <K,V>mapOf(vararg values: Pair<K,V>): Map<K, V>? {
//    return null
//}
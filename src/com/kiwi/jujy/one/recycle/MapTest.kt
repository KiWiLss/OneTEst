package com.kiwi.jujy.one.recycle

import java.util.*

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: MapTest
 * Author:   kiwilss
 * Date:     2018/7/18 14:34
 * Description: map test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {

    val treeMap = TreeMap<Char, String>()

    for (c in 'A'..'F'){

        val binary = Integer.toBinaryString(c.toInt())
        val toString = c.toInt()
        println(binary)
        println(toString)
        treeMap[c] = binary
    }

    println("---------------")
    for ((key,value) in treeMap){
        println("$key == $value")
    }

    treeMap.map {
        println(it.key)
        println(it.value)
    }

    println("---------------")
    val list = arrayListOf("10", "11", "1001")
    for ((index,element) in list.withIndex()){
        println("$index == $element")
    }
    println("---------------")
    println(isLetter('q'))
    println(isNotDigit('x'))

    println(recognize('8'))

    println("kotlin" in "java".."scale")

}

fun recognize(c: Char) = when(c){

    in '0'..'9' -> "it's a digit!"
    in 'a'..'z',in 'A'..'Z' -> "it's a letter!"

    else -> "i don't know"
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'



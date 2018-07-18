package com.kiwi.jujy.two

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: KotlinTest
 * Author:   kiwilss
 * Date:     2018/7/18 15:42
 * Description: kotlin test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    val set = hashSetOf(1, 7, 83)

    val list = arrayListOf(1, 7, 83)

    val hashMap = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)//等同于java里的.getClass()

    val stringList = listOf("first", "second", "fourteenth")
    println(stringList.last())
    println(stringList.first())

    val numberSet = setOf(1, 14, 2)
    println(numberSet.max())
    println(stringList.max())
    println(stringList.min())

    println("---------------")
    val numberList = listOf(1, 2, 3)
    println(numberList)

    println("---------------")

    println(joinToString(numberList,"~","{","}"))

    println(joinToString(numberList,separator = "*",prefix = "[",postfix = "]"))

    println(joinToString2(numberList,"*"))


    "kotlin".lastChar()



}

/**
 * 带默认参数
 */
fun <T>joinToString2(collection: Collection<T>,
                     separator: String = "",
                     prefix: String = "(",
                     postfix: String = ")") : String{
    val sb = StringBuilder(prefix)
    for ((index,element) in collection.withIndex()){
        if (index > 0){
            sb.append(separator)
        }
        sb.append(element)
    }
    sb.append(postfix)
    return sb.toString()
}


fun <T>joinToString(collection: Collection<T>,separator: String,
                    prefix: String,
                    postfix: String) : String{

    val sb = StringBuilder(prefix)
    for ((index,element) in collection.withIndex()){
        if (index > 0){
            sb.append(separator)
        }
        sb.append(element)
    }
    sb.append(postfix)
    return sb.toString()
}
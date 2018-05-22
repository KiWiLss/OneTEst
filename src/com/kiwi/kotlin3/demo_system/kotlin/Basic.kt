package com.kiwi.kotlin3.demo_system.kotlin

import com.sun.org.apache.xpath.internal.operations.Bool

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Basic
 * Author:   kiwilss
 * Date:     2018/5/21 15:20
 * Description: 基本数据类型
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    val i: Int = 1
    val list: List<Int> = listOf(1,2,3)

    showProgress(146)

    println(PersonB("Sam",35).isOlderThan(PersonB("Amy",42)))
    println(PersonB("Sam",35).isOlderThan(PersonB("Jane")))


    //数字转换
    val i2 = 1
    //显示转换
    val l: Long = i2.toLong()

    val x = 1
    val listL = listOf(1L, 2L, 3L)

    println(x.toLong() in listL)

    val b: Byte = 1
    val l2  = b + 1L
    println(l2)
    foo(42)



}

fun foo(l:Long) = println(l)

/**
 * 可空的基本数据类型
 */
data class PersonB(val name: String,val age: Int? = null){
    fun isOlderThan(other: PersonB) : Boolean?{
        if (age==null||other.age==null){
            return null
        }
        return age>other.age
    }
}

fun showProgress(progress: Int){
    val percent = progress.coerceIn(0, 100)
    println("We're ${percent}%done!")
}
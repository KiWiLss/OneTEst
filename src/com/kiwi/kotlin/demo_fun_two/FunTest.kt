package com.kiwi.kotlin.demo_fun_two

import java.util.*

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: FunTest
 * Author:   kiwilss
 * Date:     2018/4/23 11:45
 * Description: 函数的声明和调用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {

    val intArray = setOf<Int>(3, 4, 6, 7)
    val iterator = intArray.iterator()
    //遍历集合
    while (iterator.hasNext()){
        println(iterator.next())
    }
    println("set"+intArray.javaClass)

    val hashSetOf = hashSetOf<Int>()
    hashSetOf.add(3)
    hashSetOf.add(6)
    hashSetOf.add(4)
    hashSetOf.add(5)
    println("hashset"+hashSetOf.javaClass)
    val iterator1 = hashSetOf.iterator()
    while (iterator1.hasNext()){
        println(iterator1.next())
    }

    val list = arrayListOf<Int>(1, 7, 35)
    println("list的size="+list.size)
    println("list"+list.javaClass)

    val map = hashMapOf<Int, Int>(1 to 1, 2 to 2, 3 to 3)
    map[4]=4
    map.put(5,5)
    println(map.size)
    println("map"+map.javaClass)//javaClass等价于java的getClass()

}


package com.kiwi.jujy.one.recycle

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: While
 * Author:   kiwilss
 * Date:     2018/7/18 14:19
 * Description: while test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
//    var a = 8
//    while (a > 1){
//        a--
//        println(a)
//    }

    //范围1~10
    val oneToTen = 1..10
    println(oneToTen)

    val lsit = arrayListOf(1, 2, 3, 4)
    for (j in 0..(lsit.size-1)){
        println(lsit[j])
    }
    println("---------------")
    //等同于
    for (i in 0 until lsit.size){
        println(lsit[i])
    }
    lsit.forEach {
        println(it)
    }
//    for (i in 1..100){
//        println(fizzBuzz(i))
//    }

    for (i in 100 downTo 1 step 2){
        println(fizzBuzz(i))
    }




}


fun fizzBuzz(i: Int) = when{

    i % 15 ==0 -> "FizzBuzz"
    i % 3 == 0 -> "fizz"
    i % 5 == 0 -> "buzz"
    else -> "$i"

}
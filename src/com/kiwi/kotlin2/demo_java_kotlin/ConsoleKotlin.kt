package com.kiwi.kotlin2.demo_java_kotlin

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: ConsoleKotlin
 * Author:   kiwilss
 * Date:     2018/4/27 16:15
 * Description: kotlin
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
   /* args.map {
        println(it)
        it.split("_")
    }.map {
        print("$it ")
    }
    println("----------------------")
    args.flatMap {
        it.split("_")
    }.map {
        print("$it ")
    }*/

//    args.map {
//        println(it)
//    }

    args.flatMap {
        val split = it.split("_")
        println(split)
        split
    }.map {
        print("$it ${it.length}")
    }

}
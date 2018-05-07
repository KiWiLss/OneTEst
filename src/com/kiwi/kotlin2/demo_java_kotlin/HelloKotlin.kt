package com.kiwi.kotlin2.demo_java_kotlin

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: HelloKotlin
 * Author:   kiwilss
 * Date:     2018/4/27 15:39
 * Description: hello kotlin
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    val user = User(5, "herry")
    println(user)
    //调用构造方法
    HelloKotlin::class.constructors.map(::println)

    args.map {
        //println(it)
    }
}

class HelloKotlin {
    fun HelloKotlin(){

    }
}
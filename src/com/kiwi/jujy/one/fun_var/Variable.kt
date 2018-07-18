package com.kiwi.jujy.one.fun_var

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Variable
 * Author:   kiwilss
 * Date:     2018/7/18 09:59
 * Description: 变量
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    //变量声明,省略变量类型
    val question = "the ultimate"
    val answer = 42
    //不省略变量类型
    val answer2: Int = 44
    //没有初始化变量,需要声明类型
    val answer3: Int

    //val(value),不可变引用,对应java的final变量
    //var(variable),可变引用
    val message: String = "msg"

    val languages = arrayListOf("java")
    languages.add("kotlin")

    languages.map {
        println(it+"other")
    }
    //字符串模板
    println("\$message")
        println(message)

    if (args.size > 0){
        println("hello,${args[0]}")
    }

    println("${if (args.size > 0 ) args[0] else "no"}")

}
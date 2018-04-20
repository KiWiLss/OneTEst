package com.kiwi.kotlin.demo_variable

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Variable
 * Author:   kiwilss
 * Date:     2018/4/19 17:23
 * Description: 变量
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */



/**
 * 主函数
 * */
fun main(args: Array<String>) {

    //定义变量,分配一次局部变量
    val a:Int = 1 //立即赋值
    val b  = 2 //推导出Int类型
    val c :Int //暂不初始化
    c = 4 //延期分配

    //可变变量
    var d = 4 //推导出Int类型
    d+=1

    println(d)

    //字符串模板
    var e = 8  //variable变量
    //模板中的简单名称
    val  s1 = "e is $e"  //constant常量

    e=2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $e"

    println(s2)

    //val 来自value,不可变引用
    //var,varible可变引用

    val message  = arrayListOf("java")//is ArrayList<String> style

    message.add("android")

    println(message[0]+"|||"+message.get(1))



}
package com.kiwi.kotlin3

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Fun
 * Author:   kiwilss
 * Date:     2018/5/14 13:43
 * Description: 函数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


fun main(args: Array<String>) {
    println("Hello,world!")
    println(max(3,5))

    println(max5(4,8))

    //变量
    val question = "The Ultimate Question of Life,the Universe,and Everything"
    val answer = 42
    val answer2 :Int = 42//同上
    //如果变量没有初始化器,需要显式地指定它的类型
    val answer3 : Int
    answer3=33

    //可变变量,不可变变量
    val message:String

    //字符串模板


}




fun max(a:Int,b:Int):Int{
    return a+b
}

fun max2(a:Int,b:Int) : Int = a+b

fun max3(a: Int,b: Int) = a+b

/**
 * 比较大小
 */
fun max4(a: Int,b: Int):Int = if (a>b) a else b

fun max5(a: Int,b: Int) = if (a>b) a else b


package com.kiwi.kotlin3.demo_opertor

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: MutablePoint
 * Author:   kiwilss
 * Date:     2018/5/22 15:45
 * Description: mutablepoint
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
data class MutablePoint(var x: Int ,var y: Int)

/**
 * 定义一个名为"set"的运算符函数
 */
operator fun MutablePoint.set(index: Int ,value: Int){
    when(index){
        0 -> x=value
        1 -> y=value
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

fun main(args: Array<String>) {
    val mutablePoint = MutablePoint(10, 20)
    mutablePoint[1]=42
    println(mutablePoint)


}
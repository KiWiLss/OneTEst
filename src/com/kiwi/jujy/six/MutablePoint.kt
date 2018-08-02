package com.kiwi.jujy.six

import java.time.LocalDate


/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: MutablePoint
 * Author:   kiwilss
 * Date:     2018/8/1 16:30
 * Description: mutable point
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
data class MutablePoint(var x: Int, var y: Int)

/**
 * 定义set运算符
 */
operator fun MutablePoint.set(index: Int, value: Int){
    when(index){
        0 -> x = value
        1 -> y = value
        else ->
                throw IndexOutOfBoundsException("invalid coordinate $index")
    }
}


data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(p: Point) : Boolean{
    return p.x in upperLeft.x until lowerRight.x
    && p.y in upperLeft.y until lowerRight.y
}

fun main(args: Array<String>) {
    val point = MutablePoint(10, 20)
    point[1]=30
    println(point)
    var list = listOf(1, 2, 3)
    list += 3
    println(list)

    val rectangle = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(20,30) in rectangle)
    println(Point(5,5) in rectangle)

    //处理日期的区间
    println("-----------")
    val now = LocalDate.now()
    println(now)
    val vacation = now..now.plusDays(10)
    println(now.plusWeeks(1) in vacation)

    val n = 9
    println(0..(n+1))
    (0..n).forEach {
        println(it)
    }
    println("---------")
    for (c in "abc"){
        println(c)
    }

    val p = Point(10, 20)
    val (x, y) = p
    println("$x - $y")

    println("------------")
    val map = mapOf("oracle" to "java", "jetbrains" to "kotlin")
    val hashMapOf = hashMapOf(1 to 1)
    printEntries(map)



}

fun printEntries(map: Map<String, String>){
    for ((key, value) in map){
        println("$key -> $value")
    }
}
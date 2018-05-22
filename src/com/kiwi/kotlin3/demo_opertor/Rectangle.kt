package com.kiwi.kotlin3.demo_opertor

import com.sun.javafx.scene.paint.GradientUtils
import java.time.LocalDate
import javax.swing.text.html.HTMLDocument

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Rectangle
 * Author:   kiwilss
 * Date:     2018/5/22 16:04
 * Description: rectangle
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
data class Rectangle(val upperLeft: Point,val lowerRight: Point)

operator fun Rectangle.contains(p: Point) : Boolean{
    return p.x in upperLeft.x until lowerRight.x
    && p.y in upperLeft.y until lowerRight.y
}

//operator fun <T: Comparable<T>>T.rangeTo(that: T) : ClosedRange<T>{
//    return null
//}

fun main(args: Array<String>) {
    val rectangle = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(20,30) in rectangle)
    println(Point(50,30) in rectangle)
    println("-----------------")
    val now = LocalDate.now()
    println(now)
    //创建一个从今天开始的10天的区间
    val vacation = now..now.plusDays(10)
    println(vacation)
    //检测一个特定的日期是否属于这个区间
    println(now.plusWeeks(1) in vacation)
    println(now.plusWeeks(1))

    (0..9).forEach{
        println(it)
    }

    println("----------------------------")
    //迭代字符串
    for (c in "abc"){
        println(c)
    }

    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(1)..newYear

    println(newYear)
    println(daysOff)
    for (dayoff in daysOff){
        println(dayoff)
    }

    println("--------------")
    val point = Point(10, 20)
    val (x,y) = point
    println(x)





}
operator fun ClosedRange<LocalDate>.iterator() : Iterator<LocalDate> =
        object : Iterator<LocalDate>{
            var current = start

            override fun hasNext(): Boolean {
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                return current <= endInclusive
            }

            override fun next(): LocalDate = current.apply {
                //把当前日期增加一天
                current=plusDays(1)
            }

        }

//operator fun CharSequence.iterator() : CharIterator{
//
//}

package com.kiwi.jujy.six

import java.math.BigDecimal

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Point
 * Author:   kiwilss
 * Date:     2018/8/1 14:48
 * Description: point
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
 data class Point(val x: Int, val y: Int){
    //重载二元算术运算符
    operator fun plus(other: Point) : Point{
        return Point(x + other.x, y + other.y)
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Point) return false
        return other.x == x && other.y == y
    }



}

operator fun Point.get(index: Int) : Int{
    return when(index){
        0 -> x
        1 -> y
        else ->
                throw ArrayIndexOutOfBoundsException("invalid coordinate $index")
    }
}

operator fun Point.plus(other: Point) : Point{
    return Point(x + other.x,y + other.y)
}

operator fun Point.times(scele: Double) : Point{
    return Point((x * scele).toInt(), (y * scele).toInt())
}

operator fun Char.times(count: Int) : String{
    return toString().repeat(count)
}

fun main(args: Array<String>) {

    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    println(p1 + (p2))

    println(p1 * (4.0))

    println('a' * 3)

    //复合运算符
    println("-------------")

    var point = Point(1, 2)
    point += Point(3,4)
    println(point)

    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers[0])

    val list = arrayListOf(1, 2)
     list += 3
    val twoList = list + 4
    println(twoList)
    println(list)
    val newList = list + listOf(4,5)
    println(newList)
    println("---------------")
    val point1 = Point(10, 20)
    println(-point1)

    var bd = BigDecimal.ZERO
    println(bd++)
    println(bd)
    println(++bd)

    println("------------")

    val point2 = Point(10, 20)
    println(Point(10,20) == Point(10,20))

    println(point2[1])

}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

operator fun Point.unaryMinus(): Point{
    return Point(-x, -y)
}

operator fun <T>MutableCollection<T>.plusAssign(element: T) {
    this.add(element)
}





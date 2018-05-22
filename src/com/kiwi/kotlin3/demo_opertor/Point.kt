package com.kiwi.kotlin3.demo_opertor

import com.sun.javafx.scene.paint.GradientUtils
import java.math.BigDecimal

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Point
 * Author:   kiwilss
 * Date:     2018/5/22 11:16
 * Description: point
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
data class Point(val x: Int ,val y: Int){
    operator fun plus(other: Point):Point{
        return Point(x+other.x,y+other.y)
    }
}

/**
 * 声明成扩展函数
 */
operator fun Point.plus(other: Point):Point{
    return Point(x+other.x,y+other.y)
}

/**
 * times运算符
 */
operator fun Point.times(scale: Double): Point{
    return Point((x*scale).toInt(),(y*scale).toInt())
}

operator fun Char.times(count: Int): String{
    return toString().repeat(count)
}


fun main(args: Array<String>) {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1+p2)//通过+号来调用"plus"方法
    println(p1.plus(p2))

    println(p1.times(2.0))
    println(p1*1.5)

    println("-------------")
    println('a'*3)
    var point = Point(1, 2)
    point+= Point(3,4)
    println(point)


    val arrayList = ArrayList<Int>()
    arrayList+=42
    println(arrayList[0])

    println("-----------------")
    val arrayListOf = arrayListOf(1, 2)
    arrayListOf+=3
    val newList = arrayListOf+ listOf(4,5)
    println(arrayListOf)
    println(newList)

    println("-----------------")
    val p=Point(10,20)
    println(-p)

    var bd = BigDecimal.ZERO
    println(bd)
    println(bd++)
    println(bd)
    println(++bd)

    println("---------------")
    println(Point2(10,20)==Point2(10,20))



}



class Point2(val x: Int ,val y: Int ){
    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Point2) return false

        return other.x==x && other.y==y
    }
}

/**
 * 自增运算符
 */
operator fun BigDecimal.inc() = this + BigDecimal.ONE



/**
 * unary一元,minus减
 * 重载一元运算符
 */
operator fun Point.unaryMinus():Point{
    return Point(-x,-y)
}


operator fun <T>MutableCollection<T>.plusAssign(element: T){
    this.add(element)
}



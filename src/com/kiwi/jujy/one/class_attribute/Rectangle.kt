package com.kiwi.jujy.one.class_attribute

import java.util.*

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Rectangle
 * Author:   kiwilss
 * Date:     2018/7/18 10:28
 * Description: rectangle
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Rectangle(val height: Int ,val width: Int) {
    //自定义访问器
    //1,声明属性
    val isSquare: Boolean
        //2,声明属性的getter
    get(){
        return height == width
    }

    val isSjx: Boolean
    get() = height==width


}

fun createRandomRectangle(): Rectangle{
    val random = Random()
    return Rectangle(random.nextInt(),random.nextInt())
}


fun main(args: Array<String>) {
    val rectangle = Rectangle(43, 41)
    //初始化对象时,自动计算得到isSquare
    println(rectangle.isSquare)
    println(rectangle.isSjx)
}
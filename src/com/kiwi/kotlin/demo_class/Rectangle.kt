package com.kiwi.kotlin.demo_class

import java.util.*

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Rectangle
 * Author:   kiwilss
 * Date:     2018/4/20 11:42
 * Description: 自定义访问器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Rectangle(val height:Int,val width : Int){
    val isSquare : Boolean
        //声明属性的getter
//    get(){
//        return height == width
//    }
    get() = height==width
}


fun createRandomRectangle() : Rectangle{
    val random = Random()
    return Rectangle(random.nextInt(),random.nextInt())
}

fun main(args: Array<String>) {
    println(createRandomRectangle().isSquare)
}
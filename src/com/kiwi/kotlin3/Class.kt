package com.kiwi.kotlin3

import java.util.*

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Class
 * Author:   kiwilss
 * Date:     2018/5/14 14:48
 * Description: 类和属性
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    val person = Person("Bob", true)
    println(person.name)
    println(person.isMarried)

    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)



}

fun createRandomRectangle() : Rectangle{
    val random = Random()
    return Rectangle(random.nextInt(),random.nextInt())
}

class Rectangle(val height: Int ,val width: Int){
    //自定义访问器
    val isSquare:Boolean
    get(){//声明属性的getter方法
        return height==width
    }

}

/**
 * 在Kotlin中,public是默认的可见性,所以可以省略
 */
class Person(val name:String
,var isMarried:Boolean)

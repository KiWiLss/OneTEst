package com.kiwi.kotlin.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: ClassAndAttribute
 * Author:   kiwilss
 * Date:     2018/4/20 11:27
 * Description: 类和属性
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    //声明一个类
    val person = Person("hello");
    println(person.name)

    val person2 = Person2()

    person.name="change to other"
    println(person.name)
    //测试自定义访问器
    val rectangle = Rectangle(40,40)
    println(rectangle.isSquare)
}
package com.kiwi.jujy.one.class_attribute

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Person
 * Author:   kiwilss
 * Date:     2018/7/18 10:16
 * Description: person
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Person(val name: String ,var isMarried: Boolean)

fun main(args: Array<String>) {
    val person = Person("Bob", true)

    //改变属性
    person.isMarried=false

    println(person.isMarried)
    println(person.name)





}


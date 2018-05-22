package com.kiwi.kotlin3.demo_opertor

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Person
 * Author:   kiwilss
 * Date:     2018/5/22 15:08
 * Description: person
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Person(val firstName: String,val lastName: String) : Comparable<Person>{
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this,other,Person::lastName,Person::firstName)
    }
}

operator fun Point.get(index: Int) : Int{
    return when(index){
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

fun main(args: Array<String>) {
    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")
    println(p1 < p2)

    println("abc" < "bac")

    val point = Point(10, 20)
    println(point[1])





}
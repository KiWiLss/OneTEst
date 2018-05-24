package com.kiwi.kotlin3.demo_lambda

import java.util.concurrent.locks.Lock

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: PersonZ
 * Author:   kiwilss
 * Date:     2018/5/24 14:12
 * Description: person
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
data class PersonZ(val name: String, val age: Int)

fun <T> Lock.withLock(action: () -> T) : T{
    lock()
    try {
        return action()
    }finally {
        unlock()
    }
}

fun lookForAlice(people: List<PersonZ>){
    for (person in people){
        if (person.name=="Alice"){
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}

/**
 * 改用foreach
 */

fun lookForAlice2(people: List<PersonZ>){
    people.forEach {
        if (it.name=="Alice"){
            println("found!")
            return
        }
    }
    println("Alice is not found")
}

fun main(args: Array<String>) {
    val people = listOf(PersonZ("Alice", 29), PersonZ("Bobo", 31))
    println(people.filter {
        it.age < 30
    })

    val result = mutableListOf<PersonZ>()
    for (person in people){
        if (person.age < 30){
            result.add(person)
        }
    }
    println(result)
    println("--------------")
    lookForAlice(people)

    lookForAlice2(people)
    println("--------------")
    lookForAlice3(people)

    println(StringBuilder().apply  sb@{
        listOf(1,2,3).apply {
            this@sb.append(this.toString())
        }
    })

}

/**
 * 匿名函数
 */

fun lookForAlice5(people: List<PersonZ>){



}

/**
 * 用一个标签实现局部返回
 */
fun lookForAlice3(people: List<PersonZ>){
    people.forEach label@{
        if (it.name=="Alice"){
            println("FOUND")
            return@label
        }
    }
    println("Alice might be someWhere")
}

/**
 * 用forEach标签实现局部返回
 */
fun lookForAlice4(people: List<PersonZ>){
    people.forEach{
        if (it.name=="Alice"){
            println("FOUND")
            return@forEach
        }
    }
    println("Alice might be someWhere")
}
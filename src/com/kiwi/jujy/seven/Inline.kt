package com.kiwi.jujy.seven

import com.kiwi.jujy.five.PersonI
import java.util.concurrent.locks.Lock

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Inline
 * Author:   kiwilss
 * Date:     2018/8/3 09:58
 * Description: inline
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

inline fun <T> synchronized(loock: Lock, action: () -> T): T {
    loock.lock()
    try {
        return action()
    } finally {
        loock.unlock()
    }
}

fun foo(l: Lock) {
    println("before sync")
    synchronized(l) {
        println("action")
    }
    println("after sync")
}

class LockOwner(val loock: Lock) {
    fun runUnderLock(body: () -> Unit) {
        synchronized(loock, body)
    }
}

//fun <T,R>Sequence<T>.map(transform: (T) -> R) : Sequence<R>{
//    return TransformingSequence(this,transform)
//}

data class PersonIn(val name: String, val age: Int)


fun lookForAlice(people: List<PersonIn>) {
    for (person in people) {
        if (person.name == "Alice") {
            println("found!")
            return
        }
    }
    println("alice is not found")
}

fun lookForAlice2(people: List<PersonIn>) {
    people.forEach {
        if (it.name == "Alice") {
            println("found!")
            return
        }
        println(it.name)
    }
    println("alice is not found")
}

//利用标签实现局部返回
fun lookForAlice3(people: List<PersonIn>) {
    people.forEach label@{
        if (it.name == "Alice") {
            println("return")
            return@label
        }
        println(it.name)
    }
    println("alice is not found")
}

fun lookForAlice4(people: List<PersonIn>) {
    people.forEach {
        if (it.name == "Alice") {
            return@forEach
        }
        println(it.name)
    }
    println("alice is not found")
}
//匿名函数,默认使用局部返回

fun lookForAlice5(people: List<PersonIn>){
    people.forEach (fun (person){
        if (person.name == "Alice"){
            return
        }
        println("${person.name} is not alice")
    })
}

fun main(args: Array<String>) {
    val people = listOf(PersonIn("Alice", 29), PersonIn("bob", 31))
    println(people.filter {
        it.age < 30
    })

    val result = mutableListOf<PersonIn>()
    for (person in people) {
        if (person.age < 30) {
            result.add(person)
        }
    }
    println(result)
    println("------------")
    lookForAlice(people)
    println("------------")
    lookForAlice2(people)
    println("------------")
    lookForAlice3(people)
    println("------------")
    lookForAlice4(people)
    println("------------")
    lookForAlice5(people)

    people.filter (fun (person) : Boolean{
        return person.age < 30
    })



}
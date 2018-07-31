package com.kiwi.jujy.lambda.introduction

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: KotlinTest
 * Author:   kiwilss
 * Date:     2018/7/31 10:07
 * Description: kotlin lambda test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("alice", 29), Person("bob", 31))
    findTheOldest(people)
    //同上
    println(people.maxBy {
        it.age
    })
    //同上
    println(people.maxBy(Person::age))

    val sum = { x: Int , y: Int -> x + y }
    println(sum(2, 3))

    println(people.joinToString {
        it.name
    })

    println(people.joinToString(separator = " ", transform = { p: Person ->
        p.name
    }))

    println("----------------")

    val sum2 = { x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
       x +y
    }
    println(sum2(1,2))

    val errors = listOf("403 forbidden", "404 not found")
    println(printMessageWithPrefix(errors,"Error:"))

    val responses = listOf("200 ok", "418 i'm a teapot", "500 Internal server error")
    printProblemCounts(responses)

    //成员引用
    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)

    //引用扩展函数
    val isAdult = Person::isAdult
    println(isAdult(p))




}

fun Person.isAdult() = age >= 21

fun printProblemCounts(responses: Collection<String>){
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")){
            clientErrors++
        }else if (it.startsWith("5")){
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun printMessageWithPrefix(message: Collection<String>, prefix: String){
    message.forEach {
        println("$prefix $it")
    }
}

fun findTheOldest(people: List<Person>){
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people){
        if (person.age > maxAge){
            maxAge = person.age
            theOldest= person
        }
    }
    println(theOldest)
}



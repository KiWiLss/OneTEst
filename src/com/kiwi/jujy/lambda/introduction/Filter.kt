package com.kiwi.jujy.lambda.introduction

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Filter
 * Author:   kiwilss
 * Date:     2018/7/31 10:59
 * Description: filter and map
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {

    val list = listOf(1, 2, 3, 4)
    println(println(list.filter {
        it % 2 == 0
    }))

    val people = listOf(Person("alice", 29), Person("bob", 31))
    println(people.filter {
        it.age > 30
    })

    println(list.map {
        it * it
    })


    println(people.map {
        it.name
    })
    println(people.map (Person::name) )

    println("-------------------------")
    println(people.filter {
        it.age > 30
    }.map {
        it.name
    })

    println(people.filter {
        it.age > 30
    }.map(Person::name))

    println("---------------------")
    println(people.filter {
        it.age == people.maxBy {
            it.age
        }!!.age
    })

    println(people.filter {
        it.age == people.maxBy(Person::age)!!.age
    })

    //改进
    val maxAge = people.maxBy { it.age }!!.age
    println(people.filter { it.age == maxAge })

    println("--------------")
    val map = mapOf(0 to "zero", 1 to "one")
    println(map.mapValues {
        it.value.toUpperCase()
    })

    val canBeInClub27 = { p: Person -> p.age <= 27 }
    val people2 = listOf(Person("alice", 27), Person("bob", 31))
    println(people2.all(canBeInClub27))

    println(people2.all {
        it.age <= 27
    })

    println(people2.any {
        it.age <= 27
    })

    println(people2.count(canBeInClub27))
    println(people2.count {
        it.age <= 27
    })

    println("---------------")
    println(people2.find {
        it.age <= 27
    })
    println(people.groupBy(canBeInClub27))
    println(people2.groupBy {
        it.age
    })
    println("---------------")
    val list2 = listOf("a", "b", "ab")
    println(list2.groupBy {
        it.first()
    })

    println(list2.groupBy(String::first))

    println("---------------")
    println(people.map {
        it.name
    }.filter {
        it.startsWith("a")
    })
    //更高效
    println(people.asSequence()
            .map(Person::name)
            .filter { p -> p.startsWith("a") }
            .toList())




}
package com.kiwi.jujy.four

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Filter
 * Author:   kiwilss
 * Date:     2018/7/20 10:08
 * Description: filter
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(list.filter {
        it > 2
    })

    println(list.map {
        it * it
    })

    val people = listOf(Person("alice", 29),
            Person("bob", 31))
    println(people.map { it.name })
    println(people.map {
        p:Person -> p.name
    })
    val nameP = Person::name
    println(people.map(nameP))

    println(people.filter { it.age > 30 }.map(nameP))

    println("------------")
    //寻找年龄最大
    println(people.filter {
        it.age == people.maxBy {
            it.age
        }!!.age
    })
    println(people.filter { it.age == people.maxBy(Person::age)!!.age })
    //减少执行次数
    val age = people.maxBy { it.age }!!.age
    println(people.filter { it.age == age })

    println("-------map----------")
    val map = mapOf(0 to "zero", 1 to "one")
    println(map.mapValues {
        println(it.key)
        println(it.value)
        it.value.toUpperCase()
    })

    println("----------------")
    //是否全部满足某个条件,all
    val canBeInClub27 = { p:Person -> p.age >= 27 }
    println(people.all(canBeInClub27))

    println(people.all {
        it.age >= 30
    })

    //是否至少有一个匹配元素,any
    println(people.any(canBeInClub27))

    println("----------------------")
    val numbers = listOf(1, 2, 3)
    println(!numbers.all { it ==3 })
    println(numbers.any { it != 3 })

    println(people.count {
        it.age >= 30
    })

    println(people.count(canBeInClub27))

    println(people.size)
    println(people.find (canBeInClub27))

    println("--------------------")

    val people2 = listOf(Person("alice", 29),
            Person("bob", 31),Person("carol",31))
    println(people2.groupBy { it.age })


    val zm = listOf("a", "ab", "b")
    println(zm.groupBy{
        it.first()
    })

    println(zm.groupBy (String::first))





}
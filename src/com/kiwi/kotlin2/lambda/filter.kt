package com.kiwi.kotlin2.lambda

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: filter
 * Author:   kiwilss
 * Date:     2018/5/10 10:51
 * Description: 过滤
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

fun main(args: Array<String>) {
    //过滤filter
    val list = listOf(1, 2, 3, 4)
    //只留下偶数
    println(list.filter { it%2==0 })

    val predicate: (Int) -> Boolean = { it % 2 == 0 }
    val newList = list.filter(predicate)
    println(newList)

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age>30 })

    //改变map
    val newList2 = list.map{
        println(it)
        it*it
    }
    println(newList2)

   println(people.map {
       it.name })
    //用成员引用来写
    println(people.map(Person::age))

    //filter和map连接起来使用
    println(people.filter {
        it.age>30
    }.map (
        Person::name
        ))

   println(people.filter { it.age == people.maxBy  (Person::age)!!.age })

    val maxBy = people.maxBy(Person::age)
    println(maxBy)

    println("--------------------")
    val maxBy1 = people.maxBy(Person::age)
    println(maxBy1)
    val maxAge = people.maxBy(Person::age)!!.age
    println(maxAge)
   println(people.filter {
       it.age ==maxAge
   })



}


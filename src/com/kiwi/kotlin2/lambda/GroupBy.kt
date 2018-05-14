package com.kiwi.kotlin2.lambda

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: GroupBy
 * Author:   kiwilss
 * Date:     2018/5/11 15:17
 * Description: 把列表转换成分组的map
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 31), Person("Bob", 29), Person("Carol", 31))
    //把具有相同年龄的人分成一组
    println(people.groupBy {
        it.age })

    val list = listOf("a", "ab", "b")
    println(list.groupBy (String::first))

    println(people.map(Person::name).filter {
        it.startsWith("A")
    })

    //更高效的写法
    val result = people.asSequence()//把初始集合转换成序列
            .map (Person::name)
            .filter {
                it.startsWith("A")
            }.toList()
    println(result)

    println(listOf(1,2,3,4).asSequence()
            .map {
                print("map($it)")
                it*it
            }.filter {
                print("fileter($it)")
                it%2==0
            }.toList())

    println("------------")
    println(listOf(1,2,3,4).asSequence()
            .map { it*it }
            .find {
                it>3
            }
            )
//http://www.wanandroid.com/tools/mockapi/5659/version3
println("--------------")
    val people2 = listOf(Person("ALice", 29), Person("Bob", 31)
            , Person("Charles", 31), Person("Dan", 21))
    //先map,后filter
    println(people2.asSequence()
            .map { p -> p.name }
            .filter {
                it.length < 4
            }.toList()
    )
    //先filter,后map
    println(people2.asSequence()
            .filter {
                it.name.length < 4
            }.map (Person::name)
            .toList())




}
package com.kiwi.kotlin2.lambda

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: All
 * Author:   kiwilss
 * Date:     2018/5/11 10:01
 * Description: all
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {

    val canBeInClub27 = { p:Person -> p.age <= 27 }

    val getAge2 = {p:Person -> p.age}
    val getAge = Person::age

    //调用getAge,获取年龄
    val person = Person("Test", 99)
    println(getAge(person))

    //对所有元素都满足判断式
    val list = listOf(Person("Alice", 27), Person("Bob", 31))
    println(list.all {
        it.age <= 27
    })
    println(list.all(canBeInClub27))
    //对是否存在某个元素的判断
    println(list.any(canBeInClub27))

    //有多少个元素满足条件
    println(list.count(canBeInClub27))

    println("---------------------")
    val nums = listOf(1, 2, 3)
    println(!nums.all { it==3 })
    println(nums.any { it !=3  })
    val people = listOf(Person("Alice", 27), Person("Bob", 31),
            Person("Henry", 17))
    //找到满足判断式的元素
    println(list.find (canBeInClub27))

    println(people.find(canBeInClub27))





}
package com.kiwi.kotlin3.demo_lambda

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Slice
 * Author:   kiwilss
 * Date:     2018/5/24 16:29
 * Description: slice
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

//fun <T>List<T>.slice(indices: IntRange) : List<T>{
//    return listOf()
//}

fun main(args: Array<String>) {
    val letters = ('a'..'z').toList()
    println(letters)
    println(letters.slice<Char>(0..2))
    println(letters.slice(10..13))

    val authors = listOf("Dimtry", "Svetlana")
    val readers = mutableListOf<String>()

    readers.filter {
        it !in authors
    }

    println(listOf(1,2,3,4).penultimate)


}



//使用在扩展属性上
val <T>List<T>.penultimate: T
get() = this[size-2]

//
//fun <T>List<T>.filter(predicate: (T) -> Boolean) : List<T>{
//
//}


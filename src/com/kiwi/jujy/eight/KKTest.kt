package com.kiwi.jujy.eight

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: KKTest
 * Author:   kiwilss
 * Date:     2018/8/3 14:07
 * Description: kk test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface List<T>{
    operator fun get(index: Int) : T
}

fun main(args: Array<String>) {
    val suthors = listOf("Dimtry", "Svetlana")

    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))

    println(letters.slice(10..13))

    val readers = mutableListOf<String>()

    readers.filter {
        it !in suthors
    }

}

fun <T>List<T>.filter(predicate: (T) -> Boolean) : List<T>{
    return this.filter(predicate)
}
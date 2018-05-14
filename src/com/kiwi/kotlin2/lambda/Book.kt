package com.kiwi.kotlin2.lambda

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Book
 * Author:   kiwilss
 * Date:     2018/5/11 15:31
 * Description: book
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Book(val title:String,val authors:List<String>)

fun main(args: Array<String>) {
    val list = listOf("abc", "def")
    println(list.flatMap {
        val toList = it.toList()
        toList
    })
    println(
            list.map {
                it.toList()
            }
    )

    val transform: (String) -> List<Char> = {
        it.toList()
    }
    val flatMap = list.flatMap(transform)
    println(flatMap)


    val books = listOf(Book("Thuraday Next", listOf("Jasper Fforde"))
    ,Book("Mort", listOf("Terry Pratchett"))
    , Book("Good Omens", listOf("Terry Pratchett","Neil Gaiman")))

    println(books.flatMap {
        it.authors
    }.toSet())



}
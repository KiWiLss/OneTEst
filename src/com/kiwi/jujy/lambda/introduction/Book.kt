package com.kiwi.jujy.lambda.introduction

import java.io.File

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Book
 * Author:   kiwilss
 * Date:     2018/7/31 14:04
 * Description: book
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Book(val title: String, val authors: List<String>)


fun main(args: Array<String>) {
    val strings = listOf("abc", "def")
    println(strings.flatMap {
        it.toList()
    })
    //string变集合
    println("abc".toList())

    println(strings.toSet())

    val books = listOf(Book("thursday next", listOf("jasper fforde"))
            , Book("mort", listOf("terry pratchett"))
            , Book("good omens", listOf("terry pratchett", "neil gaiman")))

    println(books.flatMap {
        it.authors
    })

    println(books.map {
        it.authors
    })

    println("--------------")
    println(listOf(1, 2, 3, 4)
            .asSequence()
            .map {
                println("map $it")
                it * it
            }.filter {
                println("filter($it)")
                it % 2 == 0
            }.toList())

    println("----------")
    val people = listOf(Person("alice", 29), Person("bob", 31)
            , Person("charles", 31), Person("dan", 21))
    println(people.asSequence()
            .map(Person::name)
            .filter {
                it.length < 4
            }.toList())

    val naturalNumbers = generateSequence(0){it + 1}
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())

    println("-----------")
    val file = File("/users/svtk/.hiddendir/a.txt")
    println(file.isInsideHiddenDirectory())


    println(alphabet())
    println(alphabet2())
    println(alphabet3())
    println(alphabet4())



}

fun alphabet4() = StringBuilder().apply {
    for (letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow i know the alphabet!")
}.toString()

fun alphabet3() = with(StringBuilder()){
    for (letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow i know the alphabet!")
            //.toString()
    this@with.toString()
}

fun alphabet2() : String {
    val result = StringBuilder()
    return with(result){
        for (letter in 'A'..'Z'){
            append(letter)
        }
        append("\nNow i know the alphabet!")
                .toString()
    }
}

fun alphabet() : String {
    val result = StringBuilder()
    for(letter in 'A'..'Z'){
        result.append(letter)
    }
    result.append("\nNow i know the alphabet!")
    return result.toString()
}

fun File.isInsideHiddenDirectory() =
        generateSequence (this){ it.parentFile }.any {
            it.isHidden
        }


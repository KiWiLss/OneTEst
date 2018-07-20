package com.kiwi.jujy.four

import com.kiwi.jujy.four.java.Button
import com.kiwi.jujy.two.open.View
import java.io.File

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Book
 * Author:   kiwilss
 * Date:     2018/7/20 11:03
 * Description: book
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Book(val title: String, val authors: List<String>)


fun main(args: Array<String>) {

    val test = "testString"
    println(test.toList())
    println(test.toSet())

    val strings = listOf("abc", "def")
    println(strings.flatMap {
        it.toList()
    })

    val list = listOf(Book("Thursday Next", listOf("jasper Fforde")),
            Book("Mort", listOf("Terry Pratchett")),
            Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman")))

    println(list.flatMap { it.authors })

    println("-----------------")
    val people = listOf(Person("alice", 29), Person("Aob", 35))

    println(people.map { it.name }.filter { it.startsWith("a") })

    println("_----------------------")
    //序列

    println(people.asSequence()
            .map { it.name }
            .filter { it.startsWith("a")|| it.startsWith("A")}
            .toList())

    val naturalNumbers = generateSequence(0){
        it+1
    }
//    naturalNumbers.forEach {
//        println(it)
//    }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())

    println("-------------- --_-- ---")
    val file = File("/Users/svtk/.HiddenDir/a.txt")
    println(file.isIndiseHiddenDirectory())

    println("-----------------")
    Button().setOnClickListener({view:View -> {
        println("click")
    }})
}

fun File.isIndiseHiddenDirectory() =
        generateSequence (this){
            it.parentFile
        }.any{
            it.isHidden
        }
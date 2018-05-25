package com.kiwi.kotlin3.demo_lambda

import java.util.*
import javax.xml.ws.Service

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

    //println(listOf(1,2,3,4).penultimate)
    println(listOf(1,2,3).sum())
    println("----------------")
    println(oneHalf(3))
    println(max("kotlin","java"))
    println("--------------------")
    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)

    val processor = Processor<String?>()
    processor.process(null)

    printSum(listOf(1,2,3))
    //set不是列表,
    //printSum(setOf(1,2,3))

    //printSum(listOf("a","b","c"))

    printSum2(listOf(1,2,3))
    println("--------------------")
    println(isA<String>("abc"))
    println(isA<String>(123))

    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())
    println("--------------------")

    val serviceImpl = ServiceLoader.load(Service::class.java)

    printContents(listOf("abc","bac"))

    val strings = mutableListOf("abc", "bac")
    //addAnswer(strings)



}

fun test(i: Int){
    val n: Number = i
    fun f(s: String){
    }


}

fun addAnswer(list: MutableList<Any>){
    list.add(42)
}

fun printContents(list: List<Any>){
    println(list.joinToString())
}

inline fun <reified T> Iterable<*>.filterIsinstance() : List<T>{
    val destination = mutableListOf<T>()
    for (element in this){
        if (element is T){
            destination.add(element)
        }
    }
    return destination
}




inline fun <reified T>isA(value: Any) = value is T


/**
 * 对已知类型检查
 */
fun printSum2(c: Collection<Int>){
    if (c is List<Int>){
        println(c.sum())
    }
}

fun printSum(c: Collection<*>){
    val intList = c as? List<Int> ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}


class Processor<T>{
    fun process(value: T){
        value?.hashCode()//value是可空的,安全调用
    }
}

fun <T>ensureTrailingPeriod(seq: T) where T: CharSequence, T: Appendable{
    if (!seq.endsWith('.')){
        seq.append('.')
    }
}

fun <T: Comparable<T>>max(first: T, second: T) : T{
    return if (first > second) first else second
}

fun <T : Number>oneHalf(value: T) : Double{
    return value.toDouble()/2
}

//fun <T : Number>List<T>.sum() : T{
//    return this[0]
//}



//使用在扩展属性上
//val <T>List<T>.penultimate: T
//get() = this[size-2]

//
//fun <T>List<T>.filter(predicate: (T) -> Boolean) : List<T>{
//
//}


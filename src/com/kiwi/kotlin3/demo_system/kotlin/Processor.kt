package com.kiwi.kotlin3.demo_system.kotlin

import java.io.BufferedReader
import java.io.StringReader

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Processor
 * Author:   kiwilss
 * Date:     2018/5/21 16:09
 * Description: Unit
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface Processor<T> {
    fun process() : T
}

class NoResultProcessor : Processor<Unit>{
    override fun process() {

    }
}

fun fail(message: String): Nothing{
    throw IllegalArgumentException(message)
}

fun readNumbers(reader: BufferedReader): List<Int?>{
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()){
        try {
            val number = line.toInt()
            println(number)
            result.add(number)
        }catch (e: NumberFormatException){
            result.add(null)
        }
    }
    return result
}

fun addValidNumbers(numbers: List<Int?>){
    var sumofValidNumbers = 0
    var invalidNumbers = 0
    for (number in numbers){
        println(number)
        if (number!=null){
            sumofValidNumbers+=number
        }else{
            invalidNumbers++
        }
    }
    println("Sum of valid numbers: $sumofValidNumbers")
    println("Invalid numbers: $invalidNumbers")
}


fun addValidNumbers2(numbers: List<Int?>){
    //剔除null的元素
    val validNumbers = numbers.filterNotNull()
    println("Sum of valid numbers: ${validNumbers.sum()}")
    println("Invalid numbers:${numbers.size-validNumbers.size}")
}

fun main(args: Array<String>) {
//    val arrayList = arrayListOf(1, 2, 3)
//    for (number in arrayList){
//        println(number)
//    }
//    for ((index,element) in arrayList.withIndex()){
//        println("index=$index,element=$element")
//    }

    println("--------------")
    val reader = BufferedReader(StringReader("1\nabc\n42"))

    val readNumbers = readNumbers(reader)
    for (num in readNumbers){
            println(num)
    }
    addValidNumbers(readNumbers)

    println("--------------------")
    addValidNumbers2(readNumbers)
    val source:Collection<Int> = arrayListOf(3, 5, 7)
    val target:MutableCollection<Int> = arrayListOf(1)
    copyElements(source,target)
    println(target)


}

fun <T>copyElements(source: Collection<T>,
                    target: MutableCollection<T>){
    for (item in source){
        //循环source中所有元素
        //可变集合添加元素
        target.add(item)
    }
}



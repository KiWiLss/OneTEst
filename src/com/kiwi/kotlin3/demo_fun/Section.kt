package com.kiwi.kotlin3.demo_fun

import com.kiwi.kotlin3.demo_fun_two.lastChar as last
import java.util.*

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Section
 * Author:   kiwilss
 * Date:     2018/5/14 16:58
 * Description: 区间,数列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    val oneToTen = 1..10
    println(oneToTen)
    for (i in 1..100){
        println(fizBuzz(i))
    }
    println("-----")
    for (i in 100 downTo 1){
        println(fizBuzz(i))
    }
    println("-----")
    //迭代map
    val binaryReps = TreeMap<Char,String>()
    for (c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c]=binary
    }
    for ((letter,binary) in binaryReps){
        println("$letter= $binary")
    }
    //迭代list
    println("-----")
    val arrayListOf = arrayListOf("10", "11", "1001")
    for ((index,element) in arrayListOf.withIndex()){
        println("$index,$element")
    }
    println("-----")
    println(isLetter('q'))
    println(isNotDigit('x'))

    println(recognize('8'))
    println("----------")
    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java","Scala"))
    println("Java" in setOf("Java","Scala"))

    println("Kotlin".last())

}

/**
 * 用in检查作为when分支
 */
fun recognize(c: Char) =
        when(c){
            in '0'..'9' -> "It's a digit!"
            in 'a'..'z',in 'A'..'Z' -> "It's a letter!"
            else -> "I don't know..."
        }


/**
 * 是否在某个区间
 */
fun isLetter(c:Char) = c in 'a'..'z'||c in 'A'..'Z'

/**
 * 是否不在某个区间
 */
fun isNotDigit(c: Char) = c !in '0'..'9'


fun fizBuzz(i:Int) = when{
    i%15==0 -> "fizzbuzz"
    i%3==0 -> "fizz"
    i%5 == 0 -> "buzz"
    else -> "$i"
}
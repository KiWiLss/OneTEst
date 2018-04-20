package com.kiwi.kotlin

import java.awt.Color

fun main(args: Array<String>) {
    println("kotlintest");

    println(com.kiwi.kotlin.all_enum.Color.RED)
    println(sum(3,5))
    sum2(4,6)
    println(sum3(2,9))
}


fun sum(a: Int,b: Int) : Int{
    return a+b
}

fun sum2(a:Int ,b: Int) {
    println("$a 和 $b 的和是= ${a+b}")
}

fun sum3(a: Int,b: Int) = a+b
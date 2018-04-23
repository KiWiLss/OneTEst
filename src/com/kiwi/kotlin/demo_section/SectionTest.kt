package com.kiwi.kotlin.demo_section

import java.util.*

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: SectionTest
 * Author:   kiwilss
 * Date:     2018/4/20 17:37
 * Description: 区间和数列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
//       for (i in 1..100){//i的值在1到100之间,包含1和100
//        println(fizzBuzz(i))
//    }
//    println("-------不包含末尾值--------")
//    //范围在1到100,不包含100
//    for (i in 1 until 100){
//        println(fizzBuzz(i))
//    }
//    println("-------倒序--------")
//    //倒序
//    for (i in 100 downTo 1){
//        println(fizzBuzz(i))
//    }
//    println("-------倒序,隔一个数--------")
//    //倒序,并且隔一个数判断一次,即只判断偶数
//    for (i in 100 downTo 1 step 2){
//        println(fizzBuzz(i))
//    }

    println("-------迭代map--------")
    val treeMap = TreeMap<Char, String>()

    for (c in 'A'..'F'){
        //把SCII码转成二进制
        val toInt = c.toInt()
        println("Char=$c,Int=$toInt")
        //int类型转二进制String
        val binary = Integer.toBinaryString(toInt)
        //int类型转String
        val stringItem = Integer.toString(toInt)
        println(stringItem)
        println(binary)
        treeMap[c]=binary
    }

    //迭代map
    for ((letter , binary) in treeMap){
        println("$letter = $binary")
    }

    println("-------迭代list--------")
    val list = arrayListOf("10", "11", "1001")
    val withIndex = list.withIndex()
    println(withIndex.toString())
    for ((index ,value) in list.withIndex()){
        println("$index : $value")
    }

    println("-------检查区间--------")
    //使用in检查区间成员
    println(isLetter('q'))

    println(isLetter3('o'))
    //使用!in检查不在区间成员
        println(isNotDigit('8'))

    println("-------用when代替in和!in检查区间--------")

    println(recognize('8'))



}

fun recognize(c: Char) =
        when(c){
            in '0'..'9' -> "It's a digit! "
            //可以组合多种区间
            in 'a'..'z',in 'A'..'Z' ->"It's a ltter!"
            else -> "I don't know..."
        }


fun isLetter(c: Char) = c in 'a'..'z'|| c in 'A'..'Z'

fun isLetter2(c: Char) : Boolean = c in 'a'..'z'|| c in 'A'..'Z'

fun isLetter3(c: Char) : Boolean {//代码块的形式
    println("****")
    return c in 'a'..'z'|| c in 'A'..'Z'
}

fun isNotDigit(c: Char) = c !in '0'..'9'



fun fizzBuzz(i : Int) =
        when{
            i % 15 ==0 -> "FizzBuzz"
            i% 3 == 0 -> "fizz"
            i % 5 ==0 -> "buzz"
            else -> {
                "$i"
            }
        }
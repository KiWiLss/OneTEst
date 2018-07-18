package com.kiwi.jujy.one.exception

import java.io.BufferedReader
import java.io.StringReader

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: ExceptionTest
 * Author:   kiwilss
 * Date:     2018/7/18 15:11
 * Description: exception test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    val percentage = 0
    if (percentage !in 0..100){
        throw IllegalArgumentException("A percentage value must be between 0 and 100; $percentage")
    }
    val number = 88
    val per = if (number in 0..100) number
    else throw IllegalArgumentException("A percentage value must be between 0 and 100; $number")

    println(per)


    val bufferedReader = BufferedReader(StringReader("55"))

    //println(readNumber(bufferedReader))

    //readNumber2(bufferedReader)
    readNumber3(bufferedReader)
}

fun readNumber3(reader: BufferedReader) {
    val number = try {
        val parseInt = Integer.parseInt(reader.readLine())
        println(parseInt)
        parseInt
    }catch (e: NumberFormatException){
        null
    }
    println(number)
}

fun readNumber2(reader: BufferedReader){
    val number = try {
        Integer.parseInt(reader.readLine())
    }catch (e: NumberFormatException){
        return
    }
    println(number)
}


fun readNumber(reader: BufferedReader) : Int ?{
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }catch (e: NumberFormatException){
        return null
    }finally {
        reader.close()
    }
}
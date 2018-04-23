package com.kiwi.kotlin.demo_exception

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: ExceptionTest
 * Author:   kiwilss
 * Date:     2018/4/23 10:21
 * Description: 异常
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    val stringReader = StringReader("99")

    val reader = BufferedReader(StringReader("239"))

    println(readNumber(reader))

    println(readNumber(BufferedReader(StringReader("not a number"))))

    readNumber2(BufferedReader(StringReader("99")))
    readNumber2(BufferedReader(StringReader("not a number")))
}

fun readNumber2(reader: BufferedReader){
    val number = try {
        Integer.parseInt(reader.readLine())
    }catch (e : NumberFormatException){
        return
    }
    println(number)
}


fun readNumber(reader:BufferedReader) :Int ?{
    try {
        val readLine = reader.readLine()
        return Integer.parseInt(readLine)
    }catch (e:NumberFormatException){
        return null
    }
    finally {
        reader.close()
    }
}





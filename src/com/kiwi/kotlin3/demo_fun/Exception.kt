package com.kiwi.kotlin3.demo_fun


import java.io.BufferedReader
import java.io.StringReader

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Exception
 * Author:   kiwilss
 * Date:     2018/5/15 11:05
 * Description: 异常
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {


    println(addException(20))
    //println(addException(200))

    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
    println("---------------")
    //println(readNumber2(BufferedReader(StringReader("not a number"))))
    readNumber3(BufferedReader(StringReader("not a number")))


}

fun readNumber3(reader: BufferedReader){
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException){
        null
    }
    println(number)
}

/**
 * 把try当表达式使用
 */
fun readNumber2(reader: BufferedReader){
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException){
        return
    }
    println(number)
}

fun readNumber(reader:BufferedReader):Int?{
    //不必显示地指定这个函数可能抛出的异常
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }catch (e:NumberFormatException){
        return null
    }
    finally {
        reader.close()
    }
}

fun addException(number:Int) : Int{
    val percentage =
            if (number in 0..100){
                number
            }else{
                throw IllegalArgumentException("a percentage value must be between 0 and 100")
            }
               return percentage
}
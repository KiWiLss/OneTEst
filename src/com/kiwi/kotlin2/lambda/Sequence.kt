package com.kiwi.kotlin2.lambda

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Sequence
 * Author:   kiwilss
 * Date:     2018/5/14 10:34
 * Description: 序列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    val nextFunction: (Int) -> Int = {
        it + 1
    }
   val naturalNumbers =  generateSequence  (0, nextFunction)

    val numbersTo100 = naturalNumbers.takeWhile {
        it <= 100
    }
    println(naturalNumbers)
    println(numbersTo100)
    println(numbersTo100.sum())


    LambdaJava.postponeComputation(1000, Runnable {
        println("44")
    })
    LambdaJava.postponeComputation(1000){
        println("42")
    }

    createAllDoneRunnable().run()

    println(alphabet())
    println(alphabet2())

    println(alphabet3())



}

fun alphabet():String{

    val result = StringBuilder()
    for (letter in 'A'..'Z'){
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()

}

fun alphabet2():String{
    val stringBuilder = StringBuilder()
    return with(stringBuilder){
        for (letter in 'A'..'Z'){
            this.append(letter)
        }
        append("\n Now i know the alphabet!")
        //this@OutClass.toString()
        this.toString()
    }
}



fun alphabet3():String =
    StringBuilder().apply {
        for (letter in 'A'..'Z'){
            append(letter)
        }
        append("\n Now I know the alphabet!")
        //this.toString()
    }.toString()

fun alphabet4():String{
    return StringBuilder().apply {
        for (letter in 'A'..'Z'){
            append(letter)
        }
        append("\n Now I know the alphabet!")
    }.toString()
}

fun createAllDoneRunnable() :Runnable {
    return Runnable { println("All done!") }
}


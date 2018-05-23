package com.kiwi.kotlin3.demo_lambda

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Fun
 * Author:   kiwilss
 * Date:     2018/5/23 10:25
 * Description: fun
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

fun performRequest(url: String, callback:(code: Int,content: String) -> Unit){

}

/**
 * 定义一个函数类型的参数
 */
fun twoAndThree (operation: (Int ,Int) -> Int){
    val result = operation(2,3)
    println("The result is $result")
}

/**
 * 实现一个简单版本的filter函数
 */
fun String.filter(predicate:(Char) -> Boolean) : String{
    val sb = StringBuilder()

    for (index in 0 until length){
        val element = get(index)
        if (predicate(element)){
            sb.append(element)
        }
    }
    return sb.toString()
}

fun processTheAnswer(f: (Int) -> Int){
    println(f(42))
}

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x+y }
    //等同于
    val sum2: (Int ,Int) -> Int = { x,y ->x+y }

    val action = { println(42) }
    //等同于
    val action2: () -> Unit = { println(42) }

    var canReturnNull : () -> Int? = { null }

    var funOrNull : ((Int ,Int) -> Int)? = null

    twoAndThree({ a,b -> a+b})
    twoAndThree({a,b -> a*b})

    println("ablc".filter {
        it in 'a'..'z'
        //true
    })



}
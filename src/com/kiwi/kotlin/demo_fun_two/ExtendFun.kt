package com.kiwi.kotlin.demo_fun_two

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: ExtendFun
 * Author:   kiwilss
 * Date:     2018/4/23 14:54
 * Description: 扩展函数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

//自定义扩展函数
fun String.lastChar() : Char = this.get(this.length - 1)
//自定义扩展函数,可以省略this
fun String.lastChar2() : Char = get(length-1)

//自定义扩展属性
val String.lastChar : Char
get() = get(length-1)




fun main(args: Array<String>) {
    println("Kotlin".lastChar())
    println("Android".lastChar2())
    println(mOpCount)

    val lastChar = "java".lastChar

}
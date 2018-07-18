package com.kiwi.zt.project1.prject2

import java.io.File

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: MainA
 * Author:   kiwilss
 * Date:     2018/7/17 14:23
 * Description: mian a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class MainA {
}

fun function(){
    val str = "hello"

    fun say(count : Int = 10){
        println(str)
        if (count > 0){
            say(count-1)
        }
    }
    say()
}

fun print(str : String = "zhangtao") : String?{
    println("$str")
    return str
}

fun main(args: Array<String>) {
    print("hello1")
    print()
    function()

    val file = File("project")
    println(file.readText())

}
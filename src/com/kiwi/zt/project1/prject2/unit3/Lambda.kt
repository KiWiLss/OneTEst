package com.kiwi.zt.project1.prject2.unit3

import com.kiwi.kotlin2.demo_java_kotlin.HelloJava
import kotlin.concurrent.thread

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Lambda
 * Author:   kiwilss
 * Date:     2018/7/17 16:19
 * Description: lambda
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

fun main(args: Array<String>) {

    Thread(Runnable {
        println("run")
    }).start()

    Thread{ println("run two")}.start()

    print("hello")
}


val print = {name : String -> println(name)}
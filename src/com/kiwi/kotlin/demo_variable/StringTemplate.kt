package com.kiwi.kotlin.demo_variable

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: StringTemplate
 * @Author:   kiwilss
 * Date:     2018/4/20 11:04
 * Description: 字符串模板
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    val name = if (args.size > 0){
        args[0]
    }else{
        "Kotlin"
    }

    val  name2 = if (args.size > 0) args[0] else "Android"

    println("hello, $name ,world ,$name2")

    //编译里面的表达式
    println("Hello,${if (args.size>0) args[0] else "SomeBody"}")
}
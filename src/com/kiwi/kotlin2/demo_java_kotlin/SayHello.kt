package com.kiwi.kotlin2.demo_java_kotlin

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: SayHello
 * Author:   kiwilss
 * Date:     2018/4/27 16:59
 * Description: sayhello
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

enum class Lang(val hello:String){
    ENGLISH("Hello"),
    CHINESE("你好"),
    JAPANESE("こんにちは"),
    KOREAN("안녕하새요");

    companion object {
        fun parse(name:String):Lang{
            val toUpperCase = name.toUpperCase()
            return Lang.valueOf(toUpperCase)
        }
    }

    fun parse2(name: String):Lang{
        return Lang.valueOf(name.toUpperCase())
    }

    fun sayHello(){
        println(hello)
    }
}


fun main(args: Array<String>) {

    if (args.size==0) {
        return
    }

    val lang = Lang.parse(args[0])
    println(lang)
    lang.sayHello()


}



package com.kiwi.jujy.two

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: join
 * Author:   kiwilss
 * Date:     2018/7/18 16:24
 * Description: join
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
//fun joinToString(...) : String { ... }

//声明顶层属性
var opCount = 0
//常量
val UNIX_LINE_SEPARATOR = "\n"

fun performOperation(){
    opCount++//改变属性的值
}

fun reportOperationCount(){
    //读取属性的值
    println("Operation performed $opCount times")
}

//扩展函数
fun String.lastChar() : Char = this.get(this.length-1)

fun String.lastChar2() : Char = get(length-1)

fun <T>Collection<T>.joinToString(separator: String = "",
                                  prefix: String = "{",
                                  postfix: String = "}") : String{
    val sb = StringBuilder(prefix)
    for ((index,element) in withIndex()){
        if (index > 0){
            sb.append(separator)
        }
        sb.append(element)
    }
    sb.append(postfix)
    return sb.toString()
}

fun Collection<String>.join(separator: String = ",",
                            prefix: String = "[",
                            postfix: String = "]")
        = joinToString(separator,prefix,postfix)


infix fun Any.to(other: Any) = Pair(this,other)


fun main(args: Array<String>) {

    println("java".lastChar())
    val list = listOf(1, 2, 3)
    println(list.joinToString("&"))

    val stringList = listOf("1", "4", "34")
    println(stringList.join())

    val argsList = listOf("args:", *args)
    println(argsList)

    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    mapOf(1 to ('a'), 2 to ('b'))

   val (number, name) = 1 to "one"

    println("------------")

    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split("[.-]".toRegex()))

    println("12.345-6.a".split(".","-"))

    println("-----------")
    parsePath("/Users/yole/kotlin-book/chapter.adoc")
    parsePath2("/Users/yole/kotlin-book/chapter.adoc")
}


fun parsePath(path: String){
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val filename = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir:$directory,name: $filename ,ext: $extension")
}
//同上,使用正则表达式

fun parsePath2(path: String){
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matches = regex.matchEntire(path)
    if (matches!=null){
        val (directory, filename, extension) = matches.destructured
        println("dir-$directory, filename-$filename, extension-$extension")
    }
}


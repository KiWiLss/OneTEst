package com.kiwi.kotlin3.demo_opertor

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: NameComponents
 * Author:   kiwilss
 * Date:     2018/5/22 17:00
 * Description: namecompontents
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
/**
 * 声明一个数据量持有值
 */
data class NameComponents(val name: String,val extension: String)

fun splitFilename(fullName: String) : NameComponents{
    val result = fullName.split('.', limit = 2)
    return NameComponents(result[0],result[1])
}

fun printEntries(map: Map<String,String>){
    //在in循环中用解构声明
    for ((key,value) in map){
        println("$key -> $value")
    }
}

fun main(args: Array<String>) {
    val (name,extension) = splitFilename("example.kt")
    println(name)
    println(extension)

    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
    printEntries(map)
    println("------------")
    for ((key,value) in map){
        println("$key -> $value")
    }
    println("------------")
    for (entry in map.entries){
        val key = entry.component1()
        val value = entry.component2()
        println("$key -> $value")
    }



}



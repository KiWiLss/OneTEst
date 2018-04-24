package com.kiwi.kotlin.demo_string

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: StringTest
 * Author:   kiwilss
 * Date:     2018/4/24 14:25
 * Description: String类型字符串练习
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

fun main(args: Array<String>) {

    val resource = "12.345-6.A"

    val split = resource.split(".")

    println(split)
    for ((index, element) in split.withIndex()) {
        println("index=$index,element=$element")
    }
//    split.get(2)
//    split[2]
    println("-------------------")
    //显示创建一个正则表达式
    println(resource.split("\\.|-".toRegex()))
    println("-------------------")
    println(resource.split("\\.".toRegex()))

    //指定多个分隔符
    println(resource.split(".","-"))

    parsePath("/user/yole/kotlin-book/chapter.adoc")

    parsePath2("/user/yole/kotlin-book/chapter.adoc")
}

/**
 * 解析文件路径
 */
fun parsePath(path:String){
    //最后一个/前,目录名
    val directory = path.substringBeforeLast("/")
    //文件名加扩展名
    val fullName = path.substringAfterLast("/")
    //文件名
    val fileName = fullName.substringBeforeLast(".")
    //扩展名
    val extension = fullName.substringAfterLast(".")
    //打印
    println("Dir: $directory ,name: $fullName ,fileName: $fileName,extension:$extension")
}
/**
 * 使用正则表达式解析文件路径
 */
fun parsePath2(path: String){
    //多行三重引号
    val regex = """(.+)/(.+)\.(.+)""".toRegex()

    val matchResult = regex.matchEntire(path)

    if (matchResult!=null){
        val (directory,filename,extension) = matchResult.destructured
        println(directory)
        println(filename)
        println(extension)
    }

}

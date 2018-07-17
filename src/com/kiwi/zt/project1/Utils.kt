package com.kiwi.zt.project1

import com.kiwi.zt.project1.anonymous.A
import com.kiwi.zt.project1.anonymous.BirdTest
import kotlin.reflect.KClass

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Utils
 * Author:   kiwilss
 * Date:     2018/7/17 09:23
 * Description: utils
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    println("main fun")
    printlnMain()


    Test.sayMessage("hello")

    javaClass(BirdTest::class.java)

    kotlinClass(BirdTest::class)

    println("------------------------")
    //关键字冲突,引号
    println(BirdTest.`in`)

    funtion("")
    println("------------------------")
    val age = 99
    val name = "zhangtao"
    println(name)
    //println("我叫%d,今年%d岁",name,age)

}




fun funtion(string: String){
    //不安全的写法
    val ft1 = A.format("")
    //val format : String = A.format(string)
    val ft3 : String? = A.format(string)

    println(ft3?.length)
    //kotlin.KotlinNullPointerException
    //println(ft3!!.length)
}

fun javaClass(clazz: Class<BirdTest>){
    println(clazz.simpleName)
}

fun kotlinClass(clazz: KClass<BirdTest>){
    println(clazz.simpleName)
}

object Test{
    fun sayMessage(msg : String){
        println(msg)
    }
}

val valueOne = "know"
var name : String = "name"
var name2 : String ? = null

fun printlnMain(){
    println("main fun main")
     //name = name2!!
}
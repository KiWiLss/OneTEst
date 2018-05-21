package com.kiwi.kotlin3.demo_system.kotlin

import sun.jvm.hotspot.utilities.Assert

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: MyService
 * Author:   kiwilss
 * Date:     2018/5/18 16:31
 * Description: my service
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class MyService{
    fun performAction() : String = "foo"
}

class MyTest{
    //声明一个可空类型的属性并初始化为null
    private var myService: MyService? = null
    @Before fun setUp(){
        myService = MyService()
    }
//    @Test fun testAction(){
//
//    }
}

annotation class Before

fun veriftyUserInput(input: String?){
    if (input.isNullOrBlank()){
        println("Please fill in the required fields")
    }
    if (input.isNullOrEmpty()){
        println("empty")
    }
}

fun <T>printHashCode(t: T){
    println(t?.hashCode())
}
fun <T: Any> printHashCode2(t: T){
    println(t.hashCode())
}

fun main(args: Array<String>) {
    veriftyUserInput(" ")
    veriftyUserInput(null)
    println("-------------------")
    printHashCode(null)

    printHashCode2(42)
    //printHashCode2(null)



}


fun yellAt(person: Person){
    println(person.name.toUpperCase()+"!!!")
}

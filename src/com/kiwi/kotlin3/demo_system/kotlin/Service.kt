package com.kiwi.kotlin3.demo_system.kotlin

import com.kiwi.kotlin3.java.Person
import com.sun.xml.internal.ws.wsdl.writer.document.Service

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Service
 * Author:   kiwilss
 * Date:     2018/5/21 14:04
 * Description: service
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Service{
    fun performAction() : String = "foo"



}

class MyTest2{
    private var myService: Service?=null
}

/**
 * 不需要安全调用
 */
fun verifyUserInput(input: String?){
    if (input.isNullOrBlank()){
        println("Please fille in the required fields")
    }
}

fun <T>printHashCode2(t: T){
    println(t?.hashCode())
}

fun yellAtSafe(person:Person){
    println(person.name ?: "Anyone".toUpperCase()+"!!!")
}

fun main(args: Array<String>) {

    veriftyUserInput(" ")
    verifyUserInput(null)

    printHashCode2(null)
    printHashCode2(444)

    yellAtSafe(Person(null))


}
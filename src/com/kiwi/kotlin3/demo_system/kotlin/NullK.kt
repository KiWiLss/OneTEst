package com.kiwi.kotlin3.demo_system.kotlin

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: NullK
 * Author:   kiwilss
 * Date:     2018/5/18 09:37
 * Description: null
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    //strlen(null)
    val x: String? = null
    println(strLenSafe(x))
    println(strLenSafe("abc"))

    printALlCaps("abs")
    printALlCaps(null)

    val ceo = Employee("da boss", null)
    val developer = Employee("bob smith", ceo)
    println(managerName(developer))
    println(managerName(ceo))
    println("-------------------")

    val person = Person("Dmitry", null)
    println(person.countryName())
    println(strLenSafe2("abc"))
    println(strLenSafe2(null))
    println("-------------------")

    val address = Address("ELsester.47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person1 = Person("Dimtry", jetbrains)
    printShippingLabel(person1)
    printShippingLabel(person)
}

class Employee(val name: String,val manager: Employee?)

fun managerName(employee: Employee):String? = employee.manager?.name



fun printALlCaps(s: String?){
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

fun strlen(s:String?) = s?.length

fun strLenSafe(s: String?) : Int =
        if (s !=null) s.length else 0

class Address(val streetAddress: String,val zipCode: Int,
              val city: String,val country: String)

class Company (val name: String,val address: Address?)

class Person(val name: String,val company: Company?)

fun printShippingLabel(person: Person){

    val address = person.company?.address
        ?: throw IllegalArgumentException("No address")

    with(address){
        println(streetAddress)
        println("$zipCode $city ,$country")
    }

}



fun Person.countryName() : String{
    val country = this.company?.address?.country
    return if (country!=null) country else "Unknown"
}

fun Person.countryName2() : String =
        company?.address?.country ?: "Unknown"

fun foo(s: String?){
    val t: String = s ?: ""
}

fun strLenSafe2(s: String?) = s?.length ?: 0

package com.kiwi.jujy.five



/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: KotlinTest
 * Author:   kiwilss
 * Date:     2018/7/31 15:41
 * Description: kotlin test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    //strLen(null)
    val x: String? = null
    println(strLenSafe(x))

    printAllCaps(null)
    printAllCaps("abc")

    val employee = Employee("da boss", null)
    val developer = Employee("bob smith", employee)
    println(managerName(developer))
    println(managerName(employee))

    println("----------------")
    val person = Person("ditry", null)
    println(person.countryName("default"))
    println(person.countryName())

    foo(null)

    println("---------")
    println(strLenSafe2(null))
    println(strLenSafe2("abc"))

    println("--------")
    val address = Address("Elsestr.47", 8067, "munich", "germany")
    val company = Company("jetbrains", address)
    val person1 = Person("dmitry", company)
    printShippingLabel(person1)

    printShippingLabel(Person("alexey",null))


}

fun printShippingLabel(person: Person){
    val address = person.company?.address
        ?: throw IllegalArgumentException("No Address")

    with(address){
        println(streetAddress)
        println("$zipCode $city, $country")
    }

}



fun Person.countryName() = company?.address?.country ?: "Unknow"

fun strLenSafe2(s: String?) = s?.length ?: 0

fun foo(s: String?){
    val t: String = s ?: "my"
    val count = s?.length
    println(t)
    println(count)
}

fun Person.countryName(s: String) : String{
    val country = this.company?.address?.country
    return if (country != null ) country else s
}

class Address(val streetAddress: String, val zipCode: Int,
              val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee) : String? = employee.manager?.name

fun printAllCaps(s: String?){
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

fun strLenSafe(s: String?) : Int = if (s != null) s.length else 0

fun strLen(s: String) = s.length
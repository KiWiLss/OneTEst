package com.kiwi.jujy.seven



/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: KotlinTest
 * Author:   kiwilss
 * Date:     2018/8/2 15:12
 * Description: kotlin test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {

    val sum = {x: Int, y: Int -> x + y}
    val sum2: (Int ,Int) -> Int = {x , y -> x + y}

    val action = { println(42) }
    val action2 : () -> Unit = { println(42) }

    val canReturnNull : (Int ,Int) -> Int? = {  x, y -> null }

    val funOrNull: ((Int, Int) -> Int)? = null

    twoAndThree({a, b ->
        println(a)
        if (a > b) a else b})

    twoAndThree({ a, b -> a * b })

    println("ab1c".filter {
        it in 'a'..'z'
    })

    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
    println(calculator(Order(9)))


    println("------------")
    val contacts = listOf(Person("Dmitry", "jemerov", "123-4567"),
            Person("svetlana", "isakova", null))
    val contactListFilters2 = ContactListFilters2()

    with(contactListFilters2){
        prefix = "Dm"
        onlyWithPhoneNumber = true
    }

    println(contacts.filter (contactListFilters2.qetPredicate()) )

    println("-------------")
    val log = listOf(SiteVisit("/", 34.0, OS.WINDOWS),
            SiteVisit("/", 22.0, OS.MAX),
            SiteVisit("/login", 12.0, OS.WINDOWS),
            SiteVisit("/signup", 8.0, OS.IOS),
            SiteVisit("/", 16.3, OS.ANDROID))

    //求window启动时间的平均值
    println(log.filter {
        it.os == OS.WINDOWS
    }.map(SiteVisit::duration)
            .average())

    println(listOf(1, 2, 3).average())

    println("-----------")
    println(log.averageDurationFor(OS.MAX))


    println(log.filter {
        it.os in setOf(OS.IOS, OS.ANDROID)
    }.map(SiteVisit::duration)
            .average())


    println(log.averageDurationFor {
        it.os in setOf(OS.ANDROID, OS.IOS)
    })

    println(log.averageDurationFor {
        it.os == OS.IOS && it.path == "/signup"
    })






}

fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
        filter(predicate)
                .map {
                    it.duration
                }.average()

fun List<SiteVisit>.averageDurationFor(os: OS) =
        filter {
            it.os == os
        }.map(SiteVisit::duration)
                .average()

data class SiteVisit(val path: String,
                     val duration: Double,
                     val os: OS)

enum class OS{
    WINDOWS,LINUX,MAX,IOS,ANDROID
}



data class Person(val firstName: String,
                  val lastName: String,
                  val phoneNumber: String?)

class ContactListFilters2{
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false
    //声明一个返回函数的函数
     fun qetPredicate(): (Person) -> Boolean{
        val startsWithPrefix = {
            p: Person -> p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }
        if (!onlyWithPhoneNumber){
            return startsWithPrefix
        }
        return {
            startsWithPrefix(it) && it.phoneNumber != null }
    }
}

class ContactListFilters{
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false
}

class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery) : (Order) -> Double{
        if (delivery == Delivery.EXPEDITED){
            return {order ->  6+2.1*order.itemCount}
        }
    return {order: Order -> 1.2*order.itemCount }
}

enum class Delivery{
    STANDARD, EXPEDITED
}

fun processTheAnswer(f: (Int) -> Int){
    println(f(42))
}

fun String.filter(predicate: (Char) -> Boolean) : String{
    val sb = StringBuilder()
    for (index in 0 until length){
        val element = get(index)
        if (predicate(element)){
            sb.append(element)
        }
    }
    return sb.toString()
}

fun twoAndThree(opertaion: (Int, Int) -> Int){
    val result = opertaion(2, 3)
    println("the result is $result")
}
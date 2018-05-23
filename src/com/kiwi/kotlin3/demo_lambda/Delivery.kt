package com.kiwi.kotlin3.demo_lambda

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Delivery
 * Author:   kiwilss
 * Date:     2018/5/23 14:39
 * Description: delivery
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
enum class Delivery{
    STANDARD,EXPEDITED
}

class Order(val itemCount: Int)

fun getShippingCostculator(delivery: Delivery) : (Order) -> Double{
    if (delivery == Delivery.EXPEDITED){
        return { order -> 6+2.1*order.itemCount }
    }
    return { order -> 1.2 * order.itemCount }
}

class ContactListFilters{
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false
}

data class Person(val firstName: String,
                  val lastName: String,
                  val phoneNumber: String?)

class ContactListFilters2{
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    //声明一个返回函数的函数
    fun getPredicate() : (Person) -> Boolean {
        val startsWithPrefix = {
            p: Person -> p.firstName.startsWith(prefix)
            || p.lastName.startsWith(prefix)
        }
        if (!onlyWithPhoneNumber){
            return startsWithPrefix
        }
        return {
            startsWithPrefix(it) && it.phoneNumber !=null
        }
    }

}



fun main(args: Array<String>) {
    val calculator = getShippingCostculator(Delivery.EXPEDITED)
    println("Shipping costs ${calculator(Order(3))}")

    val contacts = listOf(Person("Dmitry", "Jemerov", "123-4567")
            , Person("Svetlana", "Isakova", null))

    val contactListFilters2 = ContactListFilters2()
    with(contactListFilters2){
        prefix="Dm"
        onlyWithPhoneNumber=true
    }
    println(contacts.filter (contactListFilters2.getPredicate()))


}
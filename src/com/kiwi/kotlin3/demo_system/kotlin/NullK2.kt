package com.kiwi.kotlin3.demo_system.kotlin

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: NullK2
 * Author:   kiwilss
 * Date:     2018/5/21 09:36
 * Description: null类型
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    //strLen(null)
//    val x: String? = null
//    val y: String? = x
    println(strLenSafe3(null))
    println(strLenSafe3("abc"))

    printAllCaps(null)
    printAllCaps("abc")

    println("------------")
    val ceo = Employee2("Da Boss", null)
    val developer = Employee2("Bob Smith", ceo)
    println(managerName2(ceo))
    println(managerName2(developer))
    println("-------------")
    val person2 = Person2("Dimtry", null)
    println(person2.countryName())

    println(strLenSafe4(null))
    println(strLenSafe4("abc"))
    println("-------------")
    val address2 = Address2("Elsestr.47", 80687, "Munich", "Germany")
    val company2 = Company2("JetBrains", address2)
    val ps = Person2("Dimtry", company2)
    printShippingLabel2(ps)
    //printShippingLabel2(Person2("Alexey",null))

    println("------------------")
    val p1 = PersonKK("Dimtry", "Jemerov")
    val p2 = PersonKK("Dimtry", "Jemerov")
    println(p1==p2)
    println(p1.equals(p2))

    //ignoreNulls2(null)
    val email:String="239@163.com"
    email.let {
        sendEmailTo2(it)
    }
    val email2:String?=null
    email2?.let {
        sendEmailTo2(it)
    }
    println("------------------")
    val theBestPersonInTheWOrld = getTheBestPersonInTheWOrld()
    if (theBestPersonInTheWOrld!=null) sendEmailTo2(theBestPersonInTheWOrld.name)
    //两者相等
    getTheBestPersonInTheWOrld()?.let {
        sendEmailTo2(it.name)
    }


}

fun getTheBestPersonInTheWOrld() : Person2? = null

fun sendEmailTo2(email: String){
    println("Sending email to $email")
}

fun ignoreNulls2(s: String?){
    val sNotNull : String = s!!
    println(sNotNull.length)
}

class PersonKK(val firstName: String,val lastName: String){
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? PersonKK ?: return false
        return otherPerson.firstName==firstName &&
                otherPerson.lastName==lastName
    }
    override fun hashCode(): Int {
        return firstName.hashCode()*37+lastName.hashCode()
    }
}



fun printShippingLabel2(person: Person2){
    val address = person.company?.address ?: throw IllegalArgumentException("No address")
    with(address){
        println(streetAddress)
        println("$zipCode $city $country")
    }
}

fun strLenSafe4(s: String?) : Int = s?.length ?: 0

fun foo2(s: String?){
    val t = s ?: ""
}

fun Person2.countryName(): String{
    val country = this.company?.address?.country
    return if (country != null) country else "Unknown"
}

class Address2(val streetAddress: String,val zipCode:Int ,val city: String,val country: String)

class Company2(val name: String,val address: Address2?)

class Person2(val name: String,val company: Company2?)



class Employee2(val name: String,val manager: Employee2?)

fun managerName2 (employee: Employee2): String? = employee.manager?.name

fun printAllCaps(s: String?){
    val allCaps = s?.toUpperCase()
    println(allCaps)
}

fun strLenSafe3(s: String?) : Int = if (s != null) s.length else 0

fun strLen(s: String?)  = s?.length



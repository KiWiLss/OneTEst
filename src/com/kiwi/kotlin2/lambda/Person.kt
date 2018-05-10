package com.kiwi.kotlin2.lambda

import javafx.scene.control.Separator

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Person
 * Author:   kiwilss
 * Date:     2018/5/9 10:37
 * Description: person
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
data class Person(val name:String ,val age:Int)

fun findTheOldest(people: List<Person>){
    var maxAge = 0
    var theOldest : Person? = null
    for (person in people){
        if (person.age>maxAge){
            maxAge=person.age
            theOldest=person
        }
    }
    println(maxAge)
    println(theOldest)
}

fun main(args: Array<String>) {
//    val list = listOf(Person("Alice", 7),
//            Person("Alice", 4))
//    findTheOldest(list)
//
//    println(list.maxBy {
//        it.age  //比较年龄,找到最大的元素
//    })
//
//    val kClass = Person::class.java
//
//    val person = list.maxBy(Person::age)
//    println(person)
//
//    var setBook = setOf<String>("hello", "hi", "你好")
//
//
//    setBook.forEach(::print)
//
//    setBook.forEach {
//        println(it)
//    }
//



   val sum =  {x:Int,y:Int -> x+y}

    println(sum(1,2))
    //或者直接使用Lambda表达式

    //run { println(42) }

    val list = listOf(Person("Alice", 7), Person("Bob", 4))
    println(list.maxBy { it.age })

    println(list.maxBy { p -> p.age })

    list.maxBy { p:Person -> p.age }

    val names = list.joinToString(separator = "", transform = { p: Person ->
        p.name
    })

    list.joinToString ("",prefix = ""){p:Person ->p.name}

    println(names)

    val sum2 = {x:Int ,y :Int -> println("Computing the sum of $x and $y")
    x+y
    }
    println(sum2(3,4))

    val errors = listOf("403 Forbidder", "404 Not Found")
    printMessagesWithPrefix(errors,"Error:")


    val responses = listOf("200 ok", "418 I'm a teapot", "500 InternalServerError")
    printProbleCounts(responses)

    val getAge = Person::age
    //等同于
    val getAge2 = { p: Person -> p.age }

    println(getAge(Person("henry",99)))

    //引用顶层函数
    run  (::salute)

    val action = {person:Person,message:String -> sendEmail(person,message)}
    val nextAction = ::sendEmail
    run { action(Person("Bob",44),"Bob") }
    run { nextAction(Person("Bob",44),"Bob") }

    println("-----------------------------")
    val createPerson = ::Person
    println(createPerson)
    val createPerson1 = createPerson("规则创建", 99)
    println(createPerson1)

    //引用扩展函数
    val kFunction1 = Person::isAdult
    println(createPerson1.isAdult())
    println(kFunction1(createPerson1))

    println("-----------------------------")
    //绑定引用
    val p = Person("Dmitry", 34)
    val personsAgeFunction = Person::age
    println(personsAgeFunction(p))

    val dmitrysAgeFuction = p::age
    println(dmitrysAgeFuction())




}

fun Person.isAdult() =
        age>=21

fun sendEmail(person: Person,message:String)=
    println("person->$person,message->$message")


fun salute() = println("Salute!")

fun printMessagesWithPrefix(message: Collection<String>,prefix:String){

    message.forEach{
        println("$prefix $it")
    }


}

fun printProbleCounts (response :Collection<String>){
    var clientErrors = 0
    var serverErrors = 0
    response.forEach {
        if (it.startsWith("4")){
            clientErrors++
        }else if (it.startsWith("5")){
            serverErrors++
        }
    }
    println("$clientErrors client error,$serverErrors serverErrors ")
}
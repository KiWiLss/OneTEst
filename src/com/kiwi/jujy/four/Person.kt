package com.kiwi.jujy.four

import com.kiwi.kotlin2.lambda.sendEmail


/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Person
 * Author:   kiwilss
 * Date:     2018/7/19 16:31
 * Description: person
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>){
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people){
        if (person.age > maxAge){
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main(args: Array<String>) {
    val people = listOf(Person("alice", 29), Person("bob", 35))
    findTheOldest(people)
    println(people.maxBy {
        it.age
    })
    println(people.maxBy (Person::age))

    println(Person::age)

    val sum = { x: Int , y: Int -> x + y}
    println(sum(1,2))

    //直接调用lambda
    //{ println(42) }

    println("--------------")
    println(people.maxBy { p: Person -> p.age })
   val params = {p: Person -> p.age }
    println(people.maxBy (params))


    people.maxBy{p -> p.age}

    val names = people.joinToString(separator = "&",
            transform = { p: Person -> p.name })
    println(names)


    val sum2 = { x: Int, y: Int ->
        println("computing the sum of $x and $y")
        x+y }

    println(sum2(3,4))

    println("------------")
    printMessagesWithPrefix(listOf("403 Forbidden", "404 Not Found"),"error:")

    val responses = listOf("200 OK", "418 i'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)


    val getAge3 = Person::age
    println(people.maxBy(getAge3))
    run (::salute)

    val action = { person: Person, message: String -> sendEmail(person,message) }
    val nextAction = ::sendEmail


    println("-----------------------")
    val createPerson = ::Person
    println(createPerson)
    val createPerson1 = createPerson("alice", 29)
    println(createPerson1)

    //扩展函数使用成员引用
    val kFunction1 = Person::isAdult
    val kFunction2 = ::Person

    //获取结果
    val kFunction11 = kFunction1(createPerson1)
    println(kFunction11)

    println("-----------------")
    val kFunction21 = Person::isAdult2
    val kFunction211 = kFunction21(createPerson1, "herry")
    println(kFunction211)




}

fun Person.isAdult() = age >= 21

fun Person.isAdult2(message: String) : Boolean {
    println(message)
    return age >=21
}



fun sendEmail(person: Person, message:String)=
        println("person->$person,message->$message")
//顶层函数
fun salute() = println("Salute!")

fun printProblemCounts(responses: Collection<String>){
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")){
            clientErrors++
        }else if (it.startsWith("5")){
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun printMessagesWithPrefix(message: Collection<String> ,prefix: String){
    message.forEach {
        println("$prefix $it")
    }
}

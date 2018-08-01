package com.kiwi.jujy.five

import com.kiwi.kotlin3.demo_system.kotlin.Before
import sun.jvm.hotspot.utilities.Assert
import java.io.BufferedReader
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Let
 * Author:   kiwilss
 * Date:     2018/8/1 09:38
 * Description: let函数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

fun sendEmailTo(email: String){
    println(email)
}

class MyService{
    fun performAction() : String = "foo"
}

class MyTest{
    private var myService: MyService? = null
    @Before fun setUp(){
        myService = MyService()
    }

//    @Test fun testAction(){
//
//    }
}

fun verifyUserInput(input: String?){
    if (input.isNullOrBlank()){
        println("please fill in the required fields")
    }
    if (input.isNullOrEmpty()){
        println("null and empty")
    }
}

fun <T>printHashCode(t: T){
    println(t?.hashCode())
}

fun yellAt(person: PersonJ){
    println(person.name.toUpperCase()+"!!!")
}

fun yellAtSafe(person: PersonJ){
    println( (person.name ?: "Anyone").toUpperCase() + "!!!")
}

class StringPrinter : StringProcessor {
    override fun process(value: String?) {
        println(value)
    }
}

fun main(args: Array<String>) {

    val email: String? = "89489494@qq.com"
    sendEmailTo(email!!)

    email?.let {
        sendEmailTo(it)
    }

    verifyUserInput(" ")
    verifyUserInput("")

    printHashCode(null)

    println("----------"+"!!!")
   // yellAt(PersonJ(null))
    yellAtSafe(PersonJ(null))

    val personJ = PersonJ(null)
    val name: String? = personJ.name
    println(name)

    showProgress(146)

    println(PersonI("sam", 35).isOlderThan(PersonI("amy", 42)))

    println(PersonI("sam", 35).isOlderThan(PersonI("amy")))

    val answer: Any = 42

    println("--------------")

    val source: Collection<Int> = arrayListOf(3, 5, 7)
    val target: MutableCollection<Int> = arrayListOf(1)

    copyELements(source,target)
    println(target)
    for ((index,element) in source.withIndex()){
        println("$index --- $element")
    }

    val list = listOf(1, 2, 3)
    val al = arrayListOf(1, 2, 3)
    al.add(4)

    println("-----------------")
    for (i in al.indices){
        println(al[i])
    }

    for (i in args.indices){
        println("argument $i is: ${args[i]}")
    }

    val letter = Array<String>(26){
        i ->
         ('a' + i).toString()
    }
    println(letter.joinToString())

    println(Array<String>(4) {
        it.toString()
    }.joinToString(){
        it+"hello"
    })
    val i = 1
    println("${('a' + i)}")
}

fun <T>copyELements (source: Collection<T>,target: MutableCollection<T>){
    for (item in source){
        target.add(item)
    }
}

fun readNumbers(reader: BufferedReader) : List<Int?>{
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()){
        val number = line.toInt()
        result.add(number)
    }
    return result
}

data class PersonI(val name: String, val age: Int? = null){
    fun isOlderThan(other: PersonI) : Boolean?{
        if ( age == null || other.age == null )
            return null
        return age > other.age
    }
}

fun showProgress(progress: Int){
    //限制值的范围
    val percent = progress.coerceIn(0, 100)
    println("we're $percent%done!")
}
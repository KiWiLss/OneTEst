package com.kiwi.jujy.three.get_set

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: User
 * Author:   kiwilss
 * Date:     2018/7/19 13:35
 * Description: user
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class User(val name: String){
    var address: String = "unspecified"
    set(value: String) {
        println("""address was changed for $name : "$field" -> "$value". """.trimIndent())
        field = value
    }
}


class LengthCounter{
    var counter: Int = 0
    private set//不能在类外部修改这个属性

    fun addWork(work: String){
        counter += work.length
    }
}

fun main(args: Array<String>) {
//    val user = User("alice")
//    user.address="elsenheimerstrasse 47 , 80687 muenchen"

    val lengthCounter = LengthCounter()
    lengthCounter.addWork("hi,")
    println(lengthCounter.counter)


}
package com.kiwi.kotlin2.demo_interface.demo_object

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: JSONFactory
 * Author:   kiwilss
 * Date:     2018/5/8 16:22
 * Description: 伴生对象中实现接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface JSONFactory<T> {
    fun fromJSON(jsonText:String) : T
}

class Person(val name:String){
    companion object : JSONFactory<Person>{
        override fun fromJSON(jsonText: String): Person {
            //实现接口的伴生对象
            //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            return Person("hello")
        }

    }
}

class Person2(val firstName:String,val lastName:String){
    //声明一个空的伴生对象
    companion object {

    }
}
//声明一个扩展函数
fun Person2.Companion.fromJSON(jsonText: String):Person2{
    return Person2("first","last")
}

fun main(args: Array<String>) {
    val person2 = Person2.fromJSON("jjjj")
    println(person2.firstName)
}
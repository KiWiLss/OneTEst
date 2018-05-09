package com.kiwi.kotlin2.demo_interface.demo_data

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Client
 * Author:   kiwilss
 * Date:     2018/5/8 10:25
 * Description: client
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Client(val name:String,val postalCode:Int){
    override fun toString(): String {
        return "Clien(name=$name ;postalCode=$postalCode)"
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}

fun main(args: Array<String>) {
    val client = Client("Herry", 9)
    println(client.toString())

    val hashSetOf = hashSetOf<Client>(client)
    hashSetOf.forEach {
        println(it.toString())
    }
    val iterator = hashSetOf.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }


}
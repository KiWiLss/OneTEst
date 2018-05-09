package com.kiwi.kotlin2.demo_interface.demo_data

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Client2
 * Author:   kiwilss
 * Date:     2018/5/8 14:15
 * Description: client
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
/**
 * 自动生成通用方法
 */
data class Client2(val name:String,val postalCode:Int)

class Client3(val name: String,val postalCode: Int){

    //copy副本
    fun copy(name: String=this.name,postalCode: Int=this.postalCode)
    = Client3(name,postalCode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Client3

        if (name != other.name) return false
        if (postalCode != other.postalCode) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + postalCode
        return result
    }

    override fun toString(): String {
        return "Client3(name='$name', postalCode=$postalCode)"
    }
}

fun main(args: Array<String>) {
    val bob = Client3("bob", 99)
    println(bob.copy(postalCode = 88))
}
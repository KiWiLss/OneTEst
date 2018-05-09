package com.kiwi.kotlin2.demo_interface.interface_variable

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: User3
 * Author:   kiwilss
 * Date:     2018/5/8 10:00
 * Description: user
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class User3(val name:String){

    var address:String="unspecified"

    set(value : String){
        println("""Address was changed for $name:"$field" -> "$value".""".trimIndent())//读取支持的字段
        field=value
    }
}

fun main(args: Array<String>) {
    val user3 = User3("Alice")
    //println(user3.address)
    user3.address="Elsenheimerstrasse 47 ,80687 Muenchen"
    println(user3.address)
}
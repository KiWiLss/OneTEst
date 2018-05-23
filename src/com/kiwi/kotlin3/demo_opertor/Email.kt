package com.kiwi.kotlin3.demo_opertor

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Email
 * Author:   kiwilss
 * Date:     2018/5/22 18:04
 * Description: email
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Email

fun loadEmails(person: PersonF): List<Email>{
    println("Load emails for ${person.name}")
    return listOf()
}

class PersonF(val name: String){

    private var _email : List<Email>? = null

    val emails: List<Email>
    get(){
        if (_email == null){
            _email = loadEmails(this)
        }
        return _email!!
    }
}
//等同,惰性初始化

fun loadEmails(person: PersonFF): List<Email>{
    println("Load emails for ${person.name}")
    return listOf()
}
class PersonFF(val name: String){
    val emails by lazy{ loadEmails(this) }
}


fun main(args: Array<String>) {
    val p = PersonF("Alice")
    //第一次访问会加载邮件
    p.emails



}



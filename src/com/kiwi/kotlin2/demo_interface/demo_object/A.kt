package com.kiwi.kotlin2.demo_interface.demo_object

import com.kiwi.kotlin.demo_fun_two.lastChar
import com.kiwi.kotlin2.demo_class_sealed.getFacebookName

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: A
 * Author:   kiwilss
 * Date:     2018/5/8 16:01
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class A{
    companion object {
        fun bar(){
            println("Companion object called")
        }
    }
}

class User{
    val nickname:String

    //两个从构造方法
    constructor(email:String){
        nickname=email.substringBefore("@")
    }

    constructor(facebookAccountId:Int){
        nickname= getFacebookName(facebookAccountId)
    }

}

class User2 private constructor(val nickname:String){//主构造方法标记为私有

    //声明伴生对象
    companion object {
        fun newSubscribingUser(email: String) =
                User2(email.substringBefore("@"))

        fun newFacebookUser(accountId:Int) =
                User2(getFacebookName(accountId))

    }

}

fun A.Test(test:String):Unit{
    println(test)
}

fun main(args: Array<String>) {

    "kotlin".lastChar()
    A.bar()
    A().Test("扩展函数")

    val newSubscribingUser = User2.newSubscribingUser("bob@gmail.com")
    println(newSubscribingUser.nickname)

    val user = User(9)
    println(user.nickname)

}
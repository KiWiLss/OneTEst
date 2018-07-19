package com.kiwi.jujy.three.`object`



/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: A
 * Author:   kiwilss
 * Date:     2018/7/19 15:40
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

class UserU{
    val nickname: String

    constructor(email: String){
        nickname = email.substringBefore("@")
    }

    constructor(facebookAccountId: Int){
        nickname = getFacebookName(facebookAccountId)
    }
}

class UserK private constructor(val nickname: String){
    //声明伴生对象
    companion object {
        fun newSubscribingUser(email: String) = UserK(email.substringBefore("@"))

        fun newFacebookUser(accountId: Int) = UserK(getFacebookName(accountId))

    }


}


fun getFacebookName(accout: Int) : String = Integer.toString(accout)


class PersonK(val name: String){
    //声明一个命名伴生对象
    companion object loader{
        fun fromJson(jsontext: String) : PersonK = PersonK(jsontext.last().toString())
    }
}

//伴生对象,实现接口
interface JSONFactory<T>{
    fun fromJSON(jsontext: String) : T

}

class PersonJ(val name: String){

    companion object : JSONFactory<PersonJ>{
        override fun fromJSON(jsontext: String): PersonJ {
            return PersonJ("hello$jsontext")
        }

    }

}

//fun <T>loadFromJSON(factory: JSONFactory<T>) : T {
//
//}


fun main(args: Array<String>) {
    A.bar()
    val newSubscribingUser = UserK.newSubscribingUser("bob@gmail.com")
    val newFacebookUser = UserK.newFacebookUser(99)
    println(newSubscribingUser.nickname)

    println(newFacebookUser.nickname)

    println("----------------")
    val personK = PersonK.loader.fromJson("kotlin")
    println(personK.name)


}
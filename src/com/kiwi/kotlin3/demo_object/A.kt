package com.kiwi.kotlin3.demo_object

import com.kiwi.kotlin2.demo_class_sealed.getFacebookName

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: A
 * Author:   kiwilss
 * Date:     2018/5/17 16:45
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

fun main(args: Array<String>) {
    A.bar()

    val newSubscribingUser = User2.newSubscribingUser("bob@gmail.com")
    println(newSubscribingUser.nickname)
    println("------------------")

    val person = Person.Loader.formJSON("alice@163.com")
    println(person.name)


}

/**
 * 在伴生对象中实现接口
 */
interface JSONFactory<T>{
    fun fromJSON(jsonText: String):T
}
class PersonJ(val name: String){
    companion object :JSONFactory<PersonJ>{
        override fun fromJSON(jsonText: String): PersonJ {
            //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            return PersonJ("personj")
        }
    }

}






class Person(val name: String){
    companion object Loader{
        fun formJSON(jsonText: String) : Person = Person(jsonText.substringBefore("@"))
    }
}


class User{
    val nickname : String

    constructor(email : String){
        nickname=email.substringBefore('@')
    }
    constructor(facebookAccountId: Int){
        nickname = getFacebookName(facebookAccountId)
    }

}
//等同于
class User2 private constructor(val nickname: String){//主构造方法私有
    //声明伴生对象
    companion object {
        fun newSubscribingUser(email: String) =
                User2(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =
                User2(getFacebookName(accountId))
    }

}
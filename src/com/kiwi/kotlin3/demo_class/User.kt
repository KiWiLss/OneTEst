package com.kiwi.kotlin3.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: User
 * Author:   kiwilss
 * Date:     2018/5/17 11:01
 * Description: user
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
open class User(val nickname:String){
    //....

}

class TwittterUser(nickname: String) : User(nickname){


}


fun main(args: Array<String>) {

    val twittterUser = TwittterUser("Alice")
    println(twittterUser.nickname)


    val userKK = UserKK("Alice")
    userKK.address="Elsenheimerstrasse 47,80687 Muenchen"

    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)


}

/**
 * constructor关键字用来开始一个主构造方法,或从构造方法的声明
 */
class User2 constructor(_nickname :String){
    val nickname: String
    init {//引入一个初始化语块
        nickname = _nickname
    }
}

class User3(_nickname: String){
    //用参数来初始化属性
    val nickname=_nickname
}

//将会生成一个不带任何参数的默认构造方法
open class ButtonT

class RadioButton : ButtonT()

//私有化构造方法
class Secretive private constructor(){
    //不能被其他代码实例化
}

interface UserTwo{
    val email: String
    val nickname: String
    get() = email.substringBefore('@')
}

class UserKK(val name: String){
    var address : String = "unspecified"
        //private set
    set(value: String){
        println("""Address was changed for $name :"$field"->"$value".""".trimIndent())
        field=value
    }
}


class LengthCounter{
    var counter : Int=0
    private set  //不能在类外部修改这个属性

    fun addWord(word: String){
        counter+=word.length
    }
}







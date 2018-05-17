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
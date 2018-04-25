package com.kiwi.kotlin2.demo_class_sealed


/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: User
 * Author:   kiwilss
 * Date:     2018/4/25 15:40
 * Description: user
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

class User(val nickname: String)

class User2 constructor(_nickname: String) {
    //带一个参数的主构造方法
    val nickname: String

    //初始化语块
    init {
        nickname = _nickname
    }
}

/**
 * 如果主构造方法没有注解或可见性修饰符,可以省略constructor
 */
class User3(_nickname: String) {
    val nickname = _nickname
}

//构造方法提供默认值
class User4(val nickname: String, val isSubscribed: Boolean = true)

/**
 * 如果一个类具有一个父类,主构造方法同样需要初始化父类.
 */
open class User5(val nickname: String) {
}

class TwitterUser( nickname: String) : User5(nickname) {
}

/**
 * 如果没有给一个类声明任何构造方法,将会生成一个不做任何事情的默认构造方法
 */
open class Button

class RadioButton : Button()

/**
 * 如果你要确保你的类不被其他代码实例化,就必须把构造方法标记为private
 */
class Secretive private constructor(){}


class User6(val age : Int ,val name:String ="name",val nickname: String="nickname")


fun main(args: Array<String>) {
    User3(_nickname = "nickname")
    User4("nickname")

    User6(9, "hello")
}




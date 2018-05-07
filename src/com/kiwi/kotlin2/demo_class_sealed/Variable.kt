package com.kiwi.kotlin2.demo_class_sealed

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Variable
 * Author:   kiwilss
 * Date:     2018/4/25 17:27
 * Description: 接口中声明属性
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


interface Variable{
    val nickname : String




}

//主构造方法属性
class PrivateUser(override val nickname: String) : Variable

//data默认实现了toString
data class SubscribingUser(val email :String):Variable{
    override val nickname
        //自定义getter
    get() = email.substringBefore("@")
}
//属性初始化
class FacebookUser(val accountId: Int):Variable{
//    override val nickname: String
//        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        override val nickname = getFacebookName(accountId)//通过定义的另一个函数获取属性
}

fun getFacebookName(accountId: Int) : String{
    return ""+accountId
}



fun main(args: Array<String>) {
    val subscribingUser = SubscribingUser("kiwilss@163.com")
    println(subscribingUser.nickname)
    println(subscribingUser)
}
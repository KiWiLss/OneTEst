package com.kiwi.kotlin2.demo_interface.interface_variable

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: User
 * Author:   kiwilss
 * Date:     2018/5/7 18:13
 * Description: user
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface User {//接口中自定义属性
    val nickname:String


}

/**
 * 主构造方法属性
 */
class PrivateUser(override val nickname: String) : User{

}


class SubscribingUser(val email:String):User{
    //自定义getter
    override val nickname: String
        get() = email.substringBefore("@")


}
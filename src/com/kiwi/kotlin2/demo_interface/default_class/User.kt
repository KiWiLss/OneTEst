package com.kiwi.kotlin2.demo_interface.default_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: User
 * Author:   kiwilss
 * Date:     2018/5/7 16:55
 * Description: user
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class User(val nickname:String){//主构造函数


}


class User3(nickname: String){
    val nickname = nickname
}

class User4(val nickname: String,val isSubscribed:Boolean = true)

fun main(args: Array<String>) {
    val user4 = User4("hary")
    println(user4.isSubscribed)


}


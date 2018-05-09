package com.kiwi.kotlin2.demo_interface.interface_variable

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: User2
 * Author:   kiwilss
 * Date:     2018/5/8 09:53
 * Description: user
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface User2 {
    val email:String
    val nickname:String
    get() = email.substringBefore("@")
}

class TestUser(override val email: String) : User2
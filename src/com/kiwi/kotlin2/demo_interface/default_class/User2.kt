package com.kiwi.kotlin2.demo_interface.default_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: User2
 * Author:   kiwilss
 * Date:     2018/5/7 16:58
 * Description: user2
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class User2 constructor(val _nickname:String){//带一个参数的主构造方法

    val nickname:String
    //初始化语块
    init {
        nickname=_nickname
    }
}
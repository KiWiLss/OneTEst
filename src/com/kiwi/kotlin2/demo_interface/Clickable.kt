package com.kiwi.kotlin2.demo_interface

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Clickable
 * Author:   kiwilss
 * Date:     2018/5/7 14:27
 * Description: clickable
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface Clickable {
    //普通的方法声明
    fun click()
    //带默认的方法的声明
    fun showOff() = println("i'm clickable")

}
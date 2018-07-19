package com.kiwi.jujy.three

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Clickable
 * Author:   kiwilss
 * Date:     2018/7/19 09:54
 * Description: clickable
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface Clickable {
    //普通的方法声明
    fun click()
    //带默认实现的方法
    fun showOff() = println("i'm clickable!")
}
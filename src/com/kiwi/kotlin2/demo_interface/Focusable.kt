package com.kiwi.kotlin2.demo_interface

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Focusable
 * Author:   kiwilss
 * Date:     2018/5/7 14:38
 * Description: focusable
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface Focusable{

    fun setFocus(b : Boolean) = println("i' m ${if (b) "false" else "true"}")

    fun showOff() = println("i'm focusable!")

}
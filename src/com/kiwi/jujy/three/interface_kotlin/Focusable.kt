package com.kiwi.jujy.three.interface_kotlin



/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Focusable
 * Author:   kiwilss
 * Date:     2018/7/19 10:06
 * Description: focusable
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface Focusable {

    fun setFocus(b: Boolean) = println("i ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("i'm focusable!")
}
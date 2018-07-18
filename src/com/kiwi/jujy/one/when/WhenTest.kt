package com.kiwi.jujy.one.`when`

import com.kiwi.jujy.one.enum_kotlin.Color
import com.kiwi.jujy.one.enum_kotlin.Color2


/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: WhenTest
 * Author:   kiwilss
 * Date:     2018/7/18 10:58
 * Description: when test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    println(getMnumonic(Color.BLUE))
    println(getMnumonic(Color.VIOLET))

    println(getWarmth(Color.RED))
    println(getWarmth(Color.GREEN))
}

fun getMnumonic(color: Color) =
        when(color){
            Color.BLUE -> "blue"
            Color.RED -> "red"
            Color.GREEN -> "green"
            Color.YELLOW -> "yellow"
            Color.ORANGE -> "orange"
            else -> "no"
        }

//合并多个分支
fun getWarmth(color: Color) =
        when(color){
            Color.BLUE,Color.YELLOW -> "blue yellow"
            Color.VIOLET,Color.ORANGE -> "violet orange"
            Color.GREEN,Color.RED -> "green red"
            else -> "no color"
        }

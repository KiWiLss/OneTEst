package com.kiwi.jujy.one.`when`

import com.kiwi.jujy.one.enum_kotlin.Color
import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception


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

//使用任意对象
fun mix(c1: Color, c2:Color) =
        when(setOf<Color>(c1,c2)){
            setOf(Color.RED,Color.YELLOW) -> Color.RED
            setOf(Color.YELLOW,Color.RED) -> Color.YELLOW
            else -> throw Exception("Dirty color")
        }

//使用不带参数的when
fun mixOptiomized(c1: Color, c2: Color) =
        when{
            (c1==Color.RED&&c2 == Color.YELLOW) ||
                    (c1 == Color.YELLOW && c2 == Color.RED) ->
                Color.ORANGE

            else -> throw Exception("Dirty color")
        }



package com.kiwi.kotlin.demo_when

import com.kiwi.kotlin.all_enum.Color
import com.kiwi.kotlin.all_enum.Color2
import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: WhenTest
 * Author:   kiwilss
 * Date:     2018/4/20 14:09
 * Description: when练习
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun getMnemonic(color: Color2) = //直接返回一个when表达式
        when (color){
            Color2.RED -> "Red,Richard"
            Color2.GREEN -> "green"
            Color2.BLUE -> "blue"
            else -> {
                "nothing"
            }
        }


fun getWrmth(color: Color2) =
        when(color){
            Color2.VIOLET,Color2.BLUE -> "blue,violet"
            Color2.GREEN,Color2.RED -> "green,red"
            else -> {
                "nothing"
            }
        }

//when分支中使用不同的对象
fun mix(c1:Color,c2:Color) =
        when(setOf(c1,c2)){
            setOf(Color.RED,Color.BLUE) -> Color.RED
            setOf(Color.RED,Color.GREEN) -> Color.GREEN
            else -> {
                throw Exception("dirty color")
            }
        }

//使用不带参数的when
fun mixOptimized (c1: Color,c2: Color) =
        when{
            (c1==Color.RED&&c2==Color.YELLOW) || (c1==Color.YELLOW&&c2==Color.RED) -> Color.YELLOW
            (c1==Color.RED&&c2==Color.ORANGE) || (c1==Color.ORANGE&&c2==Color.RED) -> Color.ORANGE
            else -> {
                throw Exception("dirty color")
            }
        }

fun main(args: Array<String>) {
    println(getMnemonic(Color2.BLUE) + "另一个"+ getMnemonic(Color2.VIOLET))
    println(getWrmth(Color2.RED))

    println(setOf(1,2))
    println(mix(Color.RED,Color.GREEN))
    //println(mix(Color.GREEN,Color.YELLOW))

    println(mixOptimized(Color.RED,Color.ORANGE))
}
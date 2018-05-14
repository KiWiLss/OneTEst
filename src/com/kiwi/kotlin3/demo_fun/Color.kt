package com.kiwi.kotlin3.demo_fun

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Color
 * Author:   kiwilss
 * Date:     2018/5/14 15:24
 * Description: meiju
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
enum class Color {
    RED,ORANGE,YELLOW,GREEN,BLUE,INDIGO,VIOLE
}

enum class Color2(val r:Int,val g:Int ,val b:Int){

    RED(255,0,0),ORANGE(255,165,0)
    ,YELLOW(255,255,0),GREEN(0,255,0)
    ,BLUE(0,0,255),INDIGO(75,0,130)
    ,VIOLET(238,130,238);

    //给枚举定义一个方法
    fun rgb() = (r*256+g)*256+b

}

fun main(args: Array<String>) {
    println(Color2.BLUE.rgb())

    println(getMnemonic(Color.BLUE))

    //不可变set
    val set = setOf(1, 2, 3)
    println(set)
    //可变set
    val mutableSetOf = mutableSetOf(2, 3, 4)
    mutableSetOf.add(9)
    println(mutableSetOf)



}

fun mixOptimized(c1: Color, c2: Color) =
        when{
            (c1== Color.RED &&c2== Color.YELLOW) -> Color.ORANGE
            (c1== Color.YELLOW &&c2== Color.BLUE) -> Color.YELLOW

            else -> throw Exception("Dirty color")
        }

fun mix(c1: Color, c2: Color) =
        when(setOf(c1,c2)){
            setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
            setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
            else -> {
                throw Exception("Dirty color")
            }
        }

fun getMnemonic(color: Color) =
        when(color){
            Color.BLUE -> "blue"
            Color.GREEN -> "green"
            Color.INDIGO -> "indigo"
            Color.ORANGE, Color.YELLOW -> "orange,yellow"
            else -> "unknow"
        }
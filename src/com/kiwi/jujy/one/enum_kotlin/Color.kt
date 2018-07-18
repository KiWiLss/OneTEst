package com.kiwi.jujy.one.enum_kotlin

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Color
 * Author:   kiwilss
 * Date:     2018/7/18 10:49
 * Description: color
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

//声明一个带属性的枚举类
enum class Color2(val r: Int,val g: Int ,val b: Int){
    RED(255,0,0),ORANGE(255,165,0)
    ,YELLOW(255,255,0),GREEN(0,255,0)
    ,BLUE(0,0,255),INDIGO(75,0,130)
    ,VIOLET(238,130,238);

    fun rgb() = (r * 256 + g) * 256 + b



}
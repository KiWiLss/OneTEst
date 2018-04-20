/**
 * Copyright (C), 2017-2017, XXX有限公司
 * FileName: Color2
 * Author:   kiwilss
 * Date:     2017/11/16 23:12
 * Description: 声明带属性的枚举
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.kiwi.kotlin.all_enum

enum class Color2(val r: Int,val g: Int,val b:Int) {//声明枚举常量的属性
    RED(255,0,0),ORANGE(255,165,0)
    ,YELLOW(255,255,0),GREEN(0,255,0)
    ,BLUE(0,0,255),INDIGO(75,0,130)
    ,VIOLET(238,130,238);//必须加分号


    //定义各个方法
    fun rgb () :Int = (r*256+g)*256+b

}

fun main(args: Array<String>) {
    println(Color2.RED.rgb())
    println(Color2.GREEN)
}
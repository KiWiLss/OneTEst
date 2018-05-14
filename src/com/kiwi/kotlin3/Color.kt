package com.kiwi.kotlin3

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
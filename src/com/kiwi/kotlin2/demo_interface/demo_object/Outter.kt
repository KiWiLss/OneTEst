package com.kiwi.kotlin2.demo_interface.demo_object

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Outter
 * Author:   kiwilss
 * Date:     2018/5/8 17:39
 * Description: outter
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Outter{//简单处理
    //嵌套类
    class Nested{
    fun execute(){
        println("test nested executed")
    }
}
    //内部类
    val testVal="test"
    inner class Inner{
        fun execute(){
            println("test inner executed")
        }
    }


}

fun main(args: Array<String>) {
    //调用内部类函数
    Outter.Nested().execute()

    Outter().Inner().execute()


}
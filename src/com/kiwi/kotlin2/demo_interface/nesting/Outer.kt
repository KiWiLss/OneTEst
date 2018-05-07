package com.kiwi.kotlin2.demo_interface.nesting

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Outer
 * Author:   kiwilss
 * Date:     2018/5/7 16:12
 * Description: 内部类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

class Outer{
    inner class Inner{
        fun getOuterReference() : Outer = this@Outer
    }
}

fun main(args: Array<String>) {
    //Outer().Inner().getOuterReference()
}

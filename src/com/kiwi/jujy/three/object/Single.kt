package com.kiwi.jujy.three.`object`

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Single
 * Author:   kiwilss
 * Date:     2018/7/19 15:23
 * Description: single
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
</desc></version></time></author> */

/**
 * 单利模式
 */
object Single {
    val instance: Single
        get() = SingleTon.SINGLE

    private object SingleTon {
         val SINGLE = Single
    }
}


fun main(args: Array<String>) {


}
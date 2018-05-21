package com.kiwi.kotlin3.demo_system.kotlin

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: StringProcessor
 * Author:   kiwilss
 * Date:     2018/5/21 15:06
 * Description: stringprocessor
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface StringProcessor {
    fun process(value: String?)


}

class StringPrinter : StringProcessor {
    override fun process(value: String?) {
        println(value)
    }
}

class NullableStringPrinter : StringProcessor {
    override fun process(value: String?) {
        if (value!=null){
            println(value)
        }
    }
}
package com.kiwi.jujy.three.`object`

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: B
 * Author:   kiwilss
 * Date:     2018/7/19 15:42
 * Description: b
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
</desc></version></time></author> */

object B {

    var bm: String? = null

    fun bb() {
        println("bb")
    }

    @JvmStatic
    fun main(args: Array<String>) {

        B.bb()

    }
}

/**
 * 单利模式
 */
class SingleHolder private constructor(){
    companion object {
        fun get() : SingleHolder{
            return Holder.instance
        }
    }
    private object Holder{
        val instance = SingleHolder()
    }
}


package com.kiwi.kotlin3.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: RichButton
 * Author:   kiwilss
 * Date:     2018/5/16 17:17
 * Description: richbutton
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
open class RichButton : Clickable {
    override fun click() {

    }
    fun diable(){

    }

    open fun animate(){

    }

    //添加final,禁止重写
    final override  fun toString(): String {
        return super.toString()
    }
}





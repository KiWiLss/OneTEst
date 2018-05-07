package com.kiwi.kotlin2.demo_interface

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: RichButton
 * Author:   kiwilss
 * Date:     2018/5/7 15:17
 * Description: richbutton
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
open class RichButton : Clickable {
    //重写了接口的方法,默认是open
     override fun click() {
    }
    //这个函数是final,不能在子类中重写
    fun disable(){}

    //这个函数是open,能在子类中重写
    open fun animate(){

    }

}
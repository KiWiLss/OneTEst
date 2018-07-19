package com.kiwi.jujy.three.interface_kotlin

import com.kiwi.jujy.three.Clickable

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: RichButton
 * Author:   kiwilss
 * Date:     2018/7/19 10:14
 * Description: richbutton
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
open class RichButton : Clickable{
    override fun click() {
        //这个函数重写了一个open函数并且它本身同样是open的
    }

    //默认是final,不能被子类重写
    fun disable(){
    }

    open fun animate(){}//可以在子类中重写

}
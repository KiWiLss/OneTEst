package com.kiwi.kotlin2.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: RichButton
 * Author:   kiwilss
 * Date:     2018/4/24 16:48
 * Description: richbutton
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
open class RichButton : Clickable {//这个类是open的,其他类可以继承他
    //final
    override fun click() {//这个类重写了一个open函数,
                                    // 并且它本身同样是open的,如果希望子类不能重写,可以标注为final
    }

    fun disable() {//这个方法是final的,不能在子类中重写

    }
    open fun animate(){//这个函数是open的,可以在子类中重写
        println("animate")
    }

}
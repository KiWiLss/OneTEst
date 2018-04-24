package com.kiwi.kotlin2.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Button2
 * Author:   kiwilss
 * Date:     2018/4/24 16:35
 * Description: button2
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Button2 : Clickable,Focusable {
    //如果同样的继承成员有不止一个实现,必须提供一个显示实现
    override fun showOff() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        super<Clickable>.showOff()

        super<Focusable>.showOff()

    }

    override fun click() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("i am click")
    }


}

fun main(args: Array<String>) {
    val button2 = Button2()
    button2.click()
    button2.showOff()
    button2.setFocus(true)
}
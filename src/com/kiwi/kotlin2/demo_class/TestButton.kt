package com.kiwi.kotlin2.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: TestButton
 * Author:   kiwilss
 * Date:     2018/4/24 17:01
 * Description: test button
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class TestButton : RichButton() {

    //重写,改成自己想要的函数
    override fun click() {
        super.click()
        println("i am testbuton click")
    }

//    override fun animate() {
//        super.animate()
//    }
}

fun main(args: Array<String>) {
    TestButton().animate()
    TestButton().click()

}
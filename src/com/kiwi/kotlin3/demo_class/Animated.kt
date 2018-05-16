package com.kiwi.kotlin3.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Animated
 * Author:   kiwilss
 * Date:     2018/5/16 17:27
 * Description: animated
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
abstract class Animated{

   abstract fun animated()

    open fun stopAnimating(){
        println("animted stop animting")
    }

    fun animateTwice(){
        println("animate twice")
    }

}

class TestAnimat : Animated() {
    override fun animated() {
        println("animated test")
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun stopAnimating() {
        super.stopAnimating()
    }


}

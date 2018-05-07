package com.kiwi.kotlin2.demo_interface

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Animated
 * Author:   kiwilss
 * Date:     2018/5/7 15:25
 * Description: animated
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
abstract class Animated {

    abstract fun animated()

    //抽象类中的非抽象函数,并不是默认open的,可以标注为open的
    open fun stopAnimating(){

    }

    fun animateTwice(){

    }
}
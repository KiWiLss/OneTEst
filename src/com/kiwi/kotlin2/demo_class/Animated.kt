package com.kiwi.kotlin2.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Animated
 * Author:   kiwilss
 * Date:     2018/4/24 17:21
 * Description: animated
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
abstract class Animated{//抽象类,不能创建他的示例
    //抽象函数
    abstract fun animate()
    //抽象类中的非抽象函数,并不是默认的open,可以标注为open
    open fun stopnimateing(){

    }
    fun animateTwice(){

    }
}
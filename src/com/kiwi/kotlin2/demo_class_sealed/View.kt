package com.kiwi.kotlin2.demo_class_sealed

import java.util.jar.Attributes
import javax.naming.Context

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: View
 * Author:   kiwilss
 * Date:     2018/4/26 15:29
 * Description: view
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
open class View{
    constructor(ctx:Context){
        //some code
        println("ctx")
    }
    constructor(ctx: Context,attr:Attributes){
        //some code
        println("ctx attr")
    }
}

class MyButton : View{
    //调用父类构造方法
//    constructor(ctx: Context) : super(ctx){
//    }
//
    constructor(ctx: Context,attr: Attributes)
    : super(ctx,attr){

    }

    constructor(ctx: Context):this(ctx,attr = Attributes()){

    }
}

fun main(args: Array<String>) {


}
package com.kiwi.jujy.three.sealed

import javax.naming.Context
import javax.swing.text.AttributeSet

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: User
 * Author:   kiwilss
 * Date:     2018/7/19 11:47
 * Description: user
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
open class User(val nickname: String)

class TwitterUser(nickname: String) : User(nickname)


open class Button//会生成一个不带任何参数的默认构造方法

class RadioButton : Button()//


class Secretive private constructor(){}//私有化构造方法


open class View{
    //从构造方法
    constructor(ctx: Context){

    }
    constructor(ctx: Context,attr: AttributeSet){

    }
}

class MyButton : View{
    constructor(ctx: Context):super(ctx){

    }

//    constructor(ctx: Context) : this(ctx,AttributeSet){
//
//    }

    constructor(ctx: Context,attr: AttributeSet) : super(ctx,attr){

    }
}

fun main(args: Array<String>) {


}



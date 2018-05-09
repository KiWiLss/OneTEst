package com.kiwi.kotlin2.demo_interface.default_class

import javax.naming.Context
import javax.swing.text.AttributeSet

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: MyButton
 * Author:   kiwilss
 * Date:     2018/5/7 17:32
 * Description: mybutton
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class MyButton : View{
    //调用父类构造方法
    constructor(ctx: Context) :super(ctx){
    }
    constructor(ctx: Context,attr:AttributeSet):super(ctx,attr){
    }
}

class MyButton2 : View{
    //val MY_STYLE:Context=Context()
    constructor(ctx: Context,attr: AttributeSet):super(ctx,attr){

    }
//    constructor(ctx: Context) : this(ctx,MY_STYLE){
//
//    }
}
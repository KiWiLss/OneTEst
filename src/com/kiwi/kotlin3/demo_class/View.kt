package com.kiwi.kotlin3.demo_class

import com.kiwi.kotlin2.demo_class_sealed.getFacebookName
import javax.naming.Context
import javax.swing.text.AttributeSet

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: View
 * Author:   kiwilss
 * Date:     2018/5/17 11:44
 * Description: view
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
open class View2{
    //从构造方法
    constructor(ctx: Context){
        //some code
    }
    constructor(ctx: Context,attr: AttributeSet){
        //some code
    }
}

class MyButton : View2 {

    //调用父类构造方法
    constructor(ctx: Context) : super(ctx){
        //....
    }
    constructor(ctx: Context,attr: AttributeSet): super(ctx,attr){

    }

}

class MyButton2 : View2{
    //val mystyle = Context(),委托给这个类的另一个构造方法
//    constructor(ctx: Context):this(ctx,null){
//
//    }

    constructor(ctx: Context,attr: AttributeSet):super(ctx,attr){

    }
}

/**
 * 接口中的属性
 */

interface UserK{
    val nickname: String
}

class PrivateUserK(override val nickname: String) : UserK

class SubscribingUser(val email: String):UserK{

    override val nickname: String
        get() = email.substringBefore('@')
    //TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
}

class FacebookUser(val accountId: Int):UserK{
    //属性初始化
    override val nickname: String
        get() = getFacebookName(accountId)
            //TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
}


package com.kiwi.kotlin2.demo_interface.default_class

import javax.naming.Context
import javax.swing.text.AttributeSet

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: View
 * Author:   kiwilss
 * Date:     2018/5/7 17:18
 * Description: view
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
open class View{
    //没有声明主构造方法,声明两个从构造方法

    constructor(ctx: Context){
        //some code
    }

    constructor(ctx: Context,attr:AttributeSet){
        //some code
    }
}
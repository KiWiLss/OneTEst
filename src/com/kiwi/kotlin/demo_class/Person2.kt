package com.kiwi.kotlin.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Person2
 * Author:   kiwilss
 * Date:     2018/4/20 11:33
 * Description: Kotlin类型类和属性
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Person2{

    val name : String   //不可变变量,只读属性:生成一个字段和一个简单的getter
    get(){
        return  name
    }
    var isMarried:Boolean = false //可写属性,一个字段,一个getter和一个setter
//    get(){
//        return isMarried
//    }



}
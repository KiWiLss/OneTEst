package com.kiwi.jujy.one

/**
 * kotlin可以导入函数,或是类,允许使用import关键字导入任何种类的声明
 */
import com.kiwi.jujy.one.class_attribute.*

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: KotlinTest
 * Author:   kiwilss
 * Date:     2018/7/18 09:34
 * Description: kotlin test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
fun main(args: Array<String>) {
    println("hello world!")

    println(max(1,3))
    println(max2(2,3))
    println(max3(3,4))


    println(createRandomRectangle().isSquare)

}


/**
 * simple function
 */
fun max(a: Int, b: Int) : Int{
    return if (a > b) a else b
}

/**
 * 返回值是expression,表达式函数体
 */
fun max2(a: Int ,b: Int) : Int = if (a > b) a else b

/**
 * 省略返回值类型
 */
fun max3(a: Int ,b: Int) = if (a > b) a else b

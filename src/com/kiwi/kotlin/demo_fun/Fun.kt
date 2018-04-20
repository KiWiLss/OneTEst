package com.kiwi.kotlin.demo_fun

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Fun
 * Author:   kiwilss
 * Date:     2018/4/19 15:07
 * Description: 有关函数声明
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 主函数
 */
fun main(args: Array<String>) {
    println("打印任意字符串")
    println(sum1(1,3))
    println(sum2(3,4))
    sum3(5,8)
    sum4(5,5)
}


/**
 * 声明函数方法一,有返回值
 */
fun sum1(a:Int ,b:Int) : Int {
    return a+b
}
/**
 *声明函数方法二,有返回值
 */
fun sum2(a: Int,b: Int) = a+b

/**
 * 声明函数,无返回值
 */
fun sum3(a: Int,b: Int){
    println("$a 和 $b 的和是 ${a+b}")
}
/**
 * 声明函数,无返回值
 */
fun sum4(a: Int,b: Int) :Unit {
    println("$a 和 $b 的和是 ${a+b}")
}




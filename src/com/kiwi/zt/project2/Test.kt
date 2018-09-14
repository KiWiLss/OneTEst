package com.kiwi.zt.project2

import kotlin.reflect.KClass

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Test
 * Author:   kiwilss
 * Date:     2018/9/12 21:11
 * Description: test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


fun main(args: Array<String>) {

    //调用java类的class
    testClass(JavaMain::class.java)
    //调用kotlin类的class
    testClass(KotlinMain::class)

    //调用java中有kotlin关键字的变量
    println(JavaMain.`in`)


}

fun testClass(clazz: Class<JavaMain>){
    println(clazz.simpleName)
}

fun testClass(clazz: KClass<KotlinMain>){
    println(clazz.simpleName)
}
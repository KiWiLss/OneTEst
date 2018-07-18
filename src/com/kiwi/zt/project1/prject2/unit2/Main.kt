package com.kiwi.zt.project1.prject2.unit2

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Main
 * Author:   kiwilss
 * Date:     2018/7/17 15:58
 * Description: main
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
open class Animal

class Dog : Animal()

//扩展函数
fun Animal.name() = "animal"

fun Dog.name() = "dog"

fun Animal.printName(animal: Animal , dog: Dog) {
    println(animal.name())
    println(dog.name())
}


fun main(args: Array<String>) {
    println(Dog().name())
    Dog().printName(Dog(),Dog())
}

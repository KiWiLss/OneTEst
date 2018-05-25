package com.kiwi.kotlin3.demo_lambda

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Producer
 * Author:   kiwilss
 * Date:     2018/5/25 15:27
 * Description: producer
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface Producer<out T>{
    fun produce() : T

}


open class Animal{
    fun feed(){}

}

//class Herd<T : Animal>{
//    val size : Int get() = this.size
//
//    operator fun get(i:Int) : T{
//        return Animal()
//    }
//}
//
//fun feedAll(animals: Herd<Animal>){
//    for (i in 0 until animals.size){
//        animals[i].feed()
//    }
//}

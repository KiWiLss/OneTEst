package com.kiwi.jujy.one.intelligence

import com.kiwi.kotlin.sum
import com.kiwi.kotlin2.demo_interface.sealed.Expr2

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Expr
 * Author:   kiwilss
 * Date:     2018/7/18 11:29
 * Description: expr
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr,val right: Expr) : Expr

//使用if层叠对表达式求值
fun eval(e: Expr) : Int{
    if (e is Num){
        return e.value
    }
    if (e is Sum){
        return eval(e.left)+ eval(e.right)
    }
    throw IllegalArgumentException("Unknown expression")
}

//if表达式
fun eval2(e: Expr) : Int =
        if (e is Num){
            e.value
        }else if (e is Sum){
            eval2(e.right)+ eval2(e.left)
        }else{
            throw IllegalArgumentException("Unknown expression")
        }

//使用when代替if
fun eval3(e: Expr) : Int =
        when(e){
            is Num -> e.value
            is Sum -> eval3(e.left)+ eval3(e.right)
            else ->   throw IllegalArgumentException("Unknown expression")
        }

//代码块作为if和when的分支
fun eval4(e: Expr) : Int =
        when(e){
            is Num ->{
                println(e.value)
                e.value
            }
            is Sum -> {
                val right = eval4(e.right)
                val left = eval4(e.left)
                left + right
            }
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) {
    println(eval(Sum(Num(3),Num(4))))

    println(eval2(Sum(Num(7),Num(9))))

    println(eval4(Sum(
            Sum(Num(1),
                    Num(2))
    ,Num(4)
    )))
}





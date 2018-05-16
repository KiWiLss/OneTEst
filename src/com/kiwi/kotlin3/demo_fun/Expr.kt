package com.kiwi.kotlin3.demo_fun

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Expr
 * Author:   kiwilss
 * Date:     2018/5/14 16:23
 * Description: expr
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface Expr

class Num(val value:Int):Expr

class Sum(val left:Expr,val right:Expr):Expr

fun main(args: Array<String>) {

    println(eval4(Sum (Sum(Num(1),Num(2)),Num(4))))


}
/**
 * 使用if表达式求值
 */
fun eval(e:Expr) :Int {
    if (e is Num){
        return e.value
    }
    if (e is Sum){
        return eval(e.left)+ eval(e.right)
    }
    throw IllegalArgumentException("Unkknown expression")
}
/**
 * 使用有返回值的if表达式
 */
fun eval2(e: Expr) : Int =
        if (e is Num){
            e.value
        }else if (e is Sum){
            eval2(e.left)+ eval2(e.right)
        }else{
            throw IllegalArgumentException("Unknown expression")
        }

/**
 * 使用when代替if
 */

fun eval3(e: Expr):Int =
        when(e){
            is Num -> e.value
            is Sum -> eval3(e.left)+ eval3(e.right)
            else -> throw IllegalArgumentException("Unknow expression")
        }
/**
 * 使用when代码块
 */
fun eval4(e: Expr):Int =
        when(e){
            is Num ->{
                println("num:${e.value}")
                e.value
            }
            is Sum ->{
                val left = eval4(e.left)
                val right = eval4(e.right)
                println("sum:$left+$right")
                left+right
            }
            else -> {
                throw IllegalArgumentException("Unknow expression")
            }
        }


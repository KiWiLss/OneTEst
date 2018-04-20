package com.kiwi.kotlin.demo_megre

import com.kiwi.kotlin.sum

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Test
 * Author:   kiwilss
 * Date:     2018/4/20 15:55
 * Description: 测试智能转换,
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

fun eval(e: Expr) : Int {
    if (e is Num){
        val n = e as Num//使用as显示转换
        //智能转换只有在变量经过is检查且之后不再发生变化的情况下有效.
        //这个属性必须是个val属性,而且不能有自定义的访问器
        return n.value
    }
    if (e is Sum){
        return eval (e.right)+ eval (e.left)
    }
    throw  IllegalArgumentException("Unknown expression")
}

fun eval2(e: Expr) :Int =
    if (e is Num){
        e.value
    }else if (e is Sum){
        eval2(e.left) + eval2(e.right)
    }else{
        throw  IllegalArgumentException("Unknown expression")
    }

fun eval4(e: Expr):Int =
        if (e is Num)
            e.value
        else if (e is Sum)
            eval4(e.left)+ eval4(e.right)
        else
            throw  IllegalArgumentException("Unknown expression")

//用when代替if
fun eval3(e: Expr) : Int =
        when(e){
            is Num -> e.value
            is Sum -> eval3(e.left)+ eval3(e.right)
            else -> throw  IllegalArgumentException("Unknown expression")
        }
//代码块作为if和when的分支
//if和when都可以使用代码块作为分支体,这种情况下,代码块中的最后一个表达式就是结果
fun evalWithLogging(e: Expr):Int =
        when(e){
            is Num ->  {
                println("num : = ${e.value}")
                e.value
            }
               is  Sum -> {
                   val left = evalWithLogging(e.left)
                   val right = evalWithLogging(e.right)
                   println("sum = $left + $right")
                   right+left
               }
            else -> {
                throw  IllegalArgumentException("Unknown expression")
            }
        }



fun main(args: Array<String>) {

    println(eval(Sum(Num(6),Sum(Num(2),Num(8)))))

    println(eval2(Sum(Num(4) , Num(8))))

    println(eval3(Sum(Num(1) , Num(7))))

    println(eval4(Sum(Num(2) ,Num(3))))
    println("------------------------")
    println(evalWithLogging(Sum(Sum(Num(2) ,Num(9)) ,Num (3))))
}
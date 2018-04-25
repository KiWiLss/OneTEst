package com.kiwi.kotlin2.demo_class_sealed


import com.kiwi.kotlin.sum

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Expr
 * Author:   kiwilss
 * Date:     2018/4/25 15:17
 * Description: expr
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
sealed class Expr{
    class Num (val value : Int) : Expr(){

    }

    class Sum (val left : Expr,val right: Expr) : Expr()

}


fun eval(expr: Expr) : Int=
        when(expr){
            is Expr.Num -> expr.value
            is  Expr.Sum -> eval(expr.left)+ eval(expr.right)
        }

fun main(args: Array<String>) {
    println(eval(Expr.Sum(Expr.Num(4), Expr.Num(8))))

}
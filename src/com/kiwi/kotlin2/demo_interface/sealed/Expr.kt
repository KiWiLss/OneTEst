package com.kiwi.kotlin2.demo_interface.sealed

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Expr
 * Author:   kiwilss
 * Date:     2018/5/7 16:23
 * Description: expr
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface Expr

class Num(val value:Int) :Expr

class Sum(val left:Expr,val right:Expr) : Expr

fun eval(expr: Expr) : Int =
        when(expr){
            is Num -> expr.value
            is Sum -> eval(expr.left) + eval(expr.right)
            else -> throw IllegalArgumentException("Unknow expression")
        }


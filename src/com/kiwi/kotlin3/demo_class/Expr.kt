package com.kiwi.kotlin3.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Expr
 * Author:   kiwilss
 * Date:     2018/5/17 10:28
 * Description: expr
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
sealed class Expr {

    class Num(val value:Int) : Expr()

    class Sum(val left : Expr,val right :Expr):Expr()



}

fun eval(e:Expr) :Int =
        when(e){
            is Expr.Num -> e.value
            is Expr.Sum -> eval(e.left)+ eval(e.right)
        }
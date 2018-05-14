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



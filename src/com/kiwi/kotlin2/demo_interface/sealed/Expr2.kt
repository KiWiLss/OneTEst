package com.kiwi.kotlin2.demo_interface.sealed

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Expr2
 * Author:   kiwilss
 * Date:     2018/5/7 16:33
 * Description: expr2
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
sealed class  Expr2{

    class Num(val value : Int) : Expr2()

    class Sum(val left : Expr2, val right:Expr2) : Expr2()
}

fun eval(e:Expr2) : Int {
    return when(e){
        is Expr2.Num ->e.value
        is Expr2.Sum -> eval(e.left)+ eval(e.right)
    }
}




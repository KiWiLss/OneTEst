package com.kiwi.jujy.three.sealed

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Expr
 * Author:   kiwilss
 * Date:     2018/7/19 11:27
 * Description: expr 密封类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
sealed class Expr{

    class Num(val value: Int) : Expr()

    class Sum(val left: Expr, val right: Expr) : Expr()


}
//class Num2 : Expr()
fun eval(expr: Expr) : Int =
    when(expr){
        is Expr.Num -> expr.value
        is Expr.Sum -> eval(expr.left) + eval(expr.right)
        //is Num2 -> TODO()
    }

//接口中声明属性
interface UserI{
    val nickname: String
}

//主构造方法属性
class PrivateUser(override val nickname: String) : UserI
//自定义getter
class SubscribingUser(val email: String) : UserI{
    override val nickname: String
    get() = email.substringBefore("@")
}

//属性初始化
class FacebookUser(val accountId: Int) : UserI{
    override val nickname: String = accountId.toString()

}

interface UserEmail{
    val email: String
    val nickname: String
    get() = email.substringBefore("@")
}

class PrivateUser2(override val email: String) : UserEmail

fun main(args: Array<String>) {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)

    println("---------------")
    println(PrivateUser2("lsswiki@qq.com").nickname)


}





package com.kiwi.kotlin3.demo_system.kotlin

import java.awt.event.ActionEvent
import javax.swing.AbstractAction
import javax.swing.JList

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: PersonAs
 * Author:   kiwilss
 * Date:     2018/5/18 15:15
 * Description: ad?
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class PersonAs(val firstName: String,val lastName: String){
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? PersonAs ?: return false
        return otherPerson.firstName == firstName  &&
                otherPerson.lastName == lastName
    }
    override fun hashCode(): Int {
        return firstName.hashCode() *37 + lastName.hashCode()
    }
}
fun ignoreNulls(s: String?){
    val sNotNull: String = s!!
    println(sNotNull.length)
}

class CopyRowAction(val list: JList<String>): AbstractAction() {
    override fun actionPerformed(e: ActionEvent?) {//只会在idEnabled返回true时被调用
        val value = list.selectedValue!!
    }
    override fun isEnabled(): Boolean =
            list.selectedValue != null
}

fun sendEmailTo(email: String){
    println("Sending email to $email")
}

fun main(args: Array<String>) {
//    val p1 = PersonAs("Dimtry", "Jemerov")
//    val p2 = PersonAs("Dimtry", "Jemerov")
//
//    println(p1==p2)
//    //==运算符会调用"equal"方法
//    println(p1.equals(42))
//    println(p1.equals(p2))
//
//    ignoreNulls(null)

    val email: String?="yole@example.com"
    //必须显式的检查这个值不为null
    if (email!=null) {
        sendEmailTo(email)
    }
    //或者用Let函数
    email?.let {
        sendEmailTo(it)
    }

    email?.let {
        sendEmailTo(email)
    }
}
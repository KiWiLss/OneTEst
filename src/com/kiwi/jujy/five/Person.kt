package com.kiwi.jujy.five

import java.awt.event.ActionEvent
import javax.swing.AbstractAction
import javax.swing.JList

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Person
 * Author:   kiwilss
 * Date:     2018/7/31 16:51
 * Description: person
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class PersonP(val firstName: String, val lastName: String){
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? PersonP ?: return false
        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int {
        return firstName.hashCode() * 37 +lastName.hashCode()
    }
}




fun ignoreNulls(s: String?){
    val sNotNull: String = s!!
    val ss = s ?.length
    val sss = s ?: "is null"
    println(sNotNull.length)
    println("$ss ||||| $sss")
}

class CopyRowAction(val list: JList<String>) : AbstractAction() {
    override fun actionPerformed(e: ActionEvent?) {
        val value = list.selectedValue!!
        println(value)
    }

    override fun isEnabled(): Boolean {
        return list.selectedValue != null
    }
}

fun main(args: Array<String>) {
    val p1 = PersonP("dmitry", "jemerov")
    val p2 = PersonP("dmitry", "jemerov")
    println(p1 == p2)
    println(p1.equals(42))

    //ignoreNulls(null)
    ignoreNulls("abc")



}
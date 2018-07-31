package com.kiwi.jujy.five

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
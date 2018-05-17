package com.kiwi.kotlin3.demo_object

import com.kiwi.kotlin3.java.Person
import java.io.File

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Payroll
 * Author:   kiwilss
 * Date:     2018/5/17 16:04
 * Description: payroll
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
/**
 * 对象声明
 */
object Payroll{

    val allEmployees = arrayListOf<Person>()

    fun calculateSalary(){
        for (person in allEmployees){

        }
    }
}


fun main(args: Array<String>) {
    //可以直接调用属性和方法
    Payroll.allEmployees.add(Person("bobo"))
    Payroll.calculateSalary()
    //声明对象,实现接口
    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))

    val file = listOf(File("/z"), File("/a"))
    println(file.sortedWith(CaseInsensitiveFileComparator))

    val persons = listOf(PersonK("ALice"), PersonK("bob"))
    println(persons.sortedWith(PersonK.NameComparator))

}

data class PersonK(val name: String){
    object NameComparator : Comparator<PersonK>{
        override fun compare(o1: PersonK?, o2: PersonK?): Int {
            return o1!!.name.compareTo(o2!!.name)
        }
    }
}

object CaseInsensitiveFileComparator : Comparator<File>{
    override fun compare(o1: File?, o2: File?): Int {
        return o1!!.path.compareTo(o2!!.path,ignoreCase = true)
    }
}
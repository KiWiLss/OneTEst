package com.kiwi.kotlin2.demo_interface.demo_object

import com.kiwi.kotlin2.demo_class_static.Person
import java.io.File

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Payroll
 * Author:   kiwilss
 * Date:     2018/5/8 14:56
 * Description: payroll
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
object Payroll{

    val allEmployees = arrayListOf<Person>()
    fun calculateSalary(){
        for (person in allEmployees){

        }
    }



}

object CaseInsensitiveFileComparator : Comparator<File>{//比较器
    override fun compare(o1: File?, o2: File?): Int {
        return o1!!.path.compareTo(o2!!.path,true)
    }


}

fun main(args: Array<String>) {
    val list = listOf(File("/Z"), File("/a"))
    println(list.sortedWith(CaseInsensitiveFileComparator))
}
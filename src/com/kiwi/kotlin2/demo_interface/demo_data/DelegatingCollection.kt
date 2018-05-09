package com.kiwi.kotlin2.demo_interface.demo_data

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: DelegatingCollection
 * Author:   kiwilss
 * Date:     2018/5/8 14:30
 * Description: 类委托
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

class DelegatingCollection<T>:Collection<T>{

    private val innerList = arrayListOf<T>()

    override val size: Int
        get() = innerList.size

    override fun isEmpty(): Boolean {
        return innerList.isEmpty()
    }

    override fun contains(element: T): Boolean {
        return innerList.contains(element)
    }

    override fun iterator(): Iterator<T> {
        return innerList.iterator()
    }
    override fun containsAll(elements: Collection<T>): Boolean = innerList.containsAll(elements)
}

/**
 * 上面的类中的方法全部自动实现
 */
class DelegatingCollection2<T>(innerList:Collection<T> = ArrayList<T>()):Collection<T> by innerList{


}

class CountingSet<T>(val innerSet:MutableCollection<T> = HashSet<T>()): MutableCollection<T> by innerSet{

    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded+=elements.size
        return innerSet.addAll(elements)
    }
}

fun main(args: Array<String>) {
    //val listOf = listOf<Int>(1, 2, 3)

    val countingSet = CountingSet<Int>()
    countingSet.addAll(listOf(1,1,2))
    println("${countingSet.objectsAdded} objects were added,${countingSet.size} remain")

    countingSet.map {
        println(it)
    }
}



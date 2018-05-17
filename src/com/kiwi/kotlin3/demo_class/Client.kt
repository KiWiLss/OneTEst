package com.kiwi.kotlin3.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Client
 * Author:   kiwilss
 * Date:     2018/5/17 14:45
 * Description: client
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

data class Client2(val name: String,val postalCode: Int)


 class Client(val name: String,val postalCode: Int){

    fun copy(name: String=this.name,
             postalCode: Int=this.postalCode) = Client(name,postalCode)

     override fun toString(): String {
         return name+"|"+postalCode
     }

}

/**
 * 使用类委托
 */
class CountingSet<T>(val innerSet: MutableCollection<T> = HashSet<T>()) : MutableCollection<T> by innerSet{
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded+=elements.size
        return innerSet.addAll(elements)
    }

}


class DelegationCollection<T> : Collection<T>{

    private val innerList = arrayListOf<T>()

    override  val size: Int
        get() = innerList.size

    override fun isEmpty(): Boolean = innerList.isEmpty()

    override fun contains(element: T): Boolean = innerList.contains(element)

    override fun containsAll(elements: Collection<T>): Boolean = innerList.containsAll(elements)

    override fun iterator(): Iterator<T> = innerList.iterator()

}

//等同于
class DelegatingCollection2<T>(innerList: Collection<T> = ArrayList<T>()) : Collection<T> by innerList{


}

fun main(args: Array<String>) {

    val bob = Client("Bob", 12)
    println(bob.copy(postalCode = 389389))

    val client2 = Client2("Alice", 99)

    println(client2.copy(postalCode = 888))
}
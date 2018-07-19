package com.kiwi.jujy.three.get_set

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Client
 * Author:   kiwilss
 * Date:     2018/7/19 13:53
 * Description: client
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Client(val name: String, val postalCode: Int){
    override fun toString() = "Client{ name=$name, postalCode=$postalCode}"

    override fun equals(other: Any?): Boolean {

        if (other == null || other !is Client){
            return false
        }
        return name == other.name && postalCode == other.postalCode
    }

    override fun hashCode(): Int {
        return name.hashCode() * 31 + postalCode
    }

    fun copy(name: String = this.name,postalCode: Int = this.postalCode) = Client(name,postalCode)
}


data class ClientData(val name: String, val postalCode: Int)


class DelegatingCollect<T> : Collection<T>{

    private val innerList = arrayListOf<T>()

    override val size: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun contains(element: T): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isEmpty(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun iterator(): Iterator<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


class DelegatingCollection2<T>(innerList: Collection<T> = ArrayList<T>()) : Collection<T> by innerList{


}


class CountingSet<T>(val innerSet: MutableCollection<T> = HashSet<T>())
    : MutableCollection<T> by innerSet{

    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded ++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        println(elements.size)
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }

}


fun inc(num : Int) {
    val num = 2
    if (num > 0) {
        val num = 3
    }
    println ("num: " + num)
}

fun main(args: Array<String>) {
    val client1 = Client("alice", 2344)
    val client2 = Client("alice", 2344)
    println(client1.toString())
    println(client1 == client2)

    val set = hashSetOf(client1)
    println(set.contains(client2))

    println(client1.hashCode())
    println(client2.hashCode())

    println("-----------------")
    val client = Client("bob", 976454)
    println(client.copy(postalCode = 9883))
    println("-----------------")
    inc(9)

    val countingSet = CountingSet<Int>()
    println(countingSet.size)
    countingSet.addAll(listOf(1,1,2))
    //set会去除重复元素
    println("${countingSet.objectsAdded} objects were added, ${countingSet.size} remian")

    println("-----------------")
    val set2 = hashSetOf(2, 3)
    println(set2)
    println(set2.size)

    countingSet.map {
        println(it)
    }

}





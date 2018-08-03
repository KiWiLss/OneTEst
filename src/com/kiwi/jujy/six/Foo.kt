package com.kiwi.jujy.six

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import java.lang.reflect.Type


/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Foo
 * Author:   kiwilss
 * Date:     2018/8/2 14:22
 * Description: foo
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Foo{
    //var p: Type by Delegate()

}

class Delegate{

        //operator fun getValue

}

class Email(val email: String){

}

class Person(val name: String){
    private var _email: List<Email>? = null

    val emails: List<Email>
    get(){
        if (_email == null){
            _email = loadEmails(this)
        }
        return _email!!
    }

    //用委托属性来实现惰性初始化
    val emailss by lazy { loadEmails(this) }

}

fun main(args: Array<String>) {
    val person = Person("alice")
    //第一次访问加载
    person.emails
    //再次访问不加载
    person.emails
    println("--------")
    person.emailss
    person.emailss

    println("-------------")
    val personFoo = PersonFoo("hello", 19, 28)
    println(personFoo.name)
    println(personFoo.age)

    personFoo.addPropertyChangeListener(PropertyChangeListener {
        event ->
        println("Property ${event.propertyName} changed"+"form ${event.oldValue} to ${event.newValue}")
    })

    personFoo.age=35
    personFoo.salary = 2100
}

class PersonFoo(val name: String, age: Int,salary: Int) : PropertyChangeAware() {
        var age: Int = age
    set(newValue){
        val oldValue = field
        println("---field----")
        println(field)
        field = newValue
        changeSupport.firePropertyChange("age",oldValue,newValue)
    }

    var salary: Int = salary
    set(value) {
        val oldValue = field
        field = value
        changeSupport.firePropertyChange("salary",oldValue,value)
    }
}

open class PropertyChangeAware{
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener){
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener){
        changeSupport.removePropertyChangeListener(listener)
    }
}

fun loadEmails(person: Person) : List<Email>{
    println("Load emails for ${person.name}")
    return listOf(Email("kiwilss.@163.com"))
}
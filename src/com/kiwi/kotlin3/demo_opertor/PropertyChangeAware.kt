package com.kiwi.kotlin3.demo_opertor

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: PropertyChangeAware
 * Author:   kiwilss
 * Date:     2018/5/23 10:08
 * Description: pa
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
open class PropertyChangeAware{

    protected val changeSupport = PropertyChangeAware()

    fun addPropertyChangeListener(listener: PropertyChangeAware){
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeAware){
        changeSupport.removePropertyChangeListener(listener)
    }
}

class PersonFFF(val name: String, age: Int ,salary: Int): PropertyChangeAware(){

    var age: Int = age
    set(newValue){
        val oldValue = field
        field = newValue
        //changeSupport.firePropertyChange()
    }
}
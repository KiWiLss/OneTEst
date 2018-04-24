package com.kiwi.kotlin.demo_local

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: User
 * Author:   kiwilss
 * Date:     2018/4/24 15:27
 * Description: User对象
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class User(val id: Int,val name:String,val address:String)


fun saveUser(user: User){
    if (user.name.isEmpty()) {
        throw IllegalArgumentException("can't save user ${user.id} :empty Name")
    }
    if (user.address.isEmpty()){
        throw IllegalArgumentException("can't save user ${user.id} :empty Address")
    }
}

fun saveUser2(user: User){
    //声明一个局部函数,来验证所有字段
    fun validate(user: User,vaule:String,filedName:String){
        println("----")
        if (vaule.isEmpty()){
            throw IllegalArgumentException("can't save user ${user.id} :empty $filedName")
        }
    }
    //调用局部函数,验证特定字段
    validate(user,user.name,"Name")
    validate(user,user.address,"Address")
}

/**
 * 在局部函数中访问外层函数的参数
 */
fun saveUser3(user: User){
    //这里省略了user参数的重复
    fun validate(value:String ,filedName:String){
        if (value.isEmpty()) {
            throw IllegalArgumentException("can't save user ${user.id} :empty $filedName")
        }
    }
    validate(user.name,"Name")
    validate(user.address,"Address")
}
/**
 * 在局部函数中访问外层函数的参数,继续改进,直接调用扩展函数
 */
fun saveUser4(user: User){
    user.validateBeforeSave()
}
fun User.validateBeforeSave(){
    fun validate(value:String ,fieldName:String){
        if (value.isEmpty()) {
            //可以直接访问User的属性
            //throw IllegalArgumentException("can't save user ${this.id} :empty $fieldName")
            throw IllegalArgumentException("can't save user $id :empty $fieldName")
        }
    }
    validate(name,"Name")
    validate(address,"Address")
}

fun main(args: Array<String>) {
    //saveUser(User(1,"",""))
    //saveUser2(User(1,"",""))
    saveUser4(User(1,"",""))

}

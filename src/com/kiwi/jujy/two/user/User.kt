package com.kiwi.jujy.two.user

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: User
 * Author:   kiwilss
 * Date:     2018/7/19 09:28
 * Description: user
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class User (val id: Int, val name: String, val address: String)

fun saveUser(user: User){
    if (user.name.isEmpty()){
        throw IllegalArgumentException("can't save user ${user.id}:empty name")
    }
    if (user.address.isEmpty()){
        throw IllegalArgumentException("can't save user ${user.id}:empty address")
    }
}

fun validate(user: User,value: String, fieldName: String){
    if (value.isEmpty()){
        throw IllegalArgumentException("can't save user ${user.id} :empty $fieldName")
    }
    validate(user,user.name,"Name")
    validate(user,user.address,"address")
}

fun saveUser2(user: User){
    fun validate(value: String, fieldName: String){
        if (value.isEmpty()){
            throw IllegalArgumentException("can't save user ${user.id} :"+"empty $fieldName")
        }
    }
    validate(user.name,"name")
    validate(user.address,"address")
}

//验证逻辑放到扩展函数
fun User.validateBeforeSave(){
    fun validate(value: String, fieldName: String){
        if (value.isEmpty()){
            throw IllegalArgumentException("can't save user $id :empty $fieldName")
        }
    }
    validate(name,"name")
    validate(address,"address")
}

fun main(args: Array<String>) {
    //saveUser2(User(9,"herry",""))
    User(10,"ten","").validateBeforeSave()
}
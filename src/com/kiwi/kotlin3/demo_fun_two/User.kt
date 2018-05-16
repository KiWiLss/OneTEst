package com.kiwi.kotlin3.demo_fun_two

import javax.jws.soap.SOAPBinding

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: User
 * Author:   kiwilss
 * Date:     2018/5/16 16:01
 * Description: user
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class User(val id :Int ,val name : String, val address: String)



fun saveUser(user: User){
    if (user.name.isEmpty()){
        throw IllegalArgumentException("can't save user ${user.id} :empty name")
    }
    if (user.address.isEmpty()){
        throw IllegalArgumentException("can't save user ${user.id} :empty address")
    }
}

fun saveUser2(user: User){

    //声明一个局部函数来验证所有字段
    fun validate(user: User,value :String,filedName:String){
        if (value.isEmpty()){
            throw IllegalArgumentException("can't save user ${user.id} :empty $filedName")
        }
    }
    validate(user,user.name,"Name")
    validate(user,user.address,"Address")

}

//扩展函数
fun User.saveUser3(){
    fun validat(value:String,fieldName:String){
        if (value.isEmpty()){
            throw IllegalArgumentException("Can't save user $id ,empty $fieldName")
        }
    }
    validat(this.name,"Name")
    validat(address,"address")
}


fun main(args: Array<String>) {
    //saveUser(User(1,"",""))
    //saveUser2(User(3,"",""))

    val user = User(3, "", "")
    user.saveUser3()
}
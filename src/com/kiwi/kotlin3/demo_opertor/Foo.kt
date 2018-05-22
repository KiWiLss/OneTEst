package com.kiwi.kotlin3.demo_opertor

import org.omg.PortableServer.portable.Delegate
import java.lang.reflect.Type
import kotlin.reflect.KProperty


/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Foo
 * Author:   kiwilss
 * Date:     2018/5/22 17:53
 * Description: foo
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class Foo{

    var p: Type by Delegate()



}
class Delegate{
//    operator fun getValue(){
//    }
//    operator fun setValue(){}
    operator fun getValue(foo: Foo, property: KProperty<*>): Type {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    operator fun setValue(foo: Foo, property: KProperty<*>, type: Type) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
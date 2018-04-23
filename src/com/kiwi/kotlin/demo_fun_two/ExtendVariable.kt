package com.kiwi.kotlin.demo_fun_two

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: ExtendVariable
 * Author:   kiwilss
 * Date:     2018/4/23 16:58
 * Description: 扩展属性
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class ExtendVariable{
    val String.lastChar : Char
    get(){
        return get(length-1)
    }



}


package com.kiwi.kotlin2.demo_class

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Clickable
 * Author:   kiwilss
 * Date:     2018/4/24 16:17
 * Description: 点击接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
/**
 * 接口中,不能使用final,open,abstract.接口中的成员始终是open的,不能声明
 * 成final,如果没有函数体,那么它就是abstract
 */
interface Clickable {
    //普通的方法声明
    fun click()
    //带默认方法的实现
    fun showOff() = println("i'm clickable!")
}
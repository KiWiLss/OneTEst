package com.kiwi.kotlin2.demo_class


import java.io.Serializable

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: State
 * Author:   kiwilss
 * Date:     2018/4/25 14:04
 * Description: state
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface State : Serializable

interface View{

    fun  getCurrentState() : State

    fun restoreState(state: State) {

    }
}
package com.kiwi.kotlin2

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Test
 * Author:   kiwilss
 * Date:     2018/4/24 16:16
 * Description: test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
</desc></version></time></author> */

object Test {//单利模式

    private val mTest: Test? = null

    val instance: Test
        get() = SingleTest.TEST_INSTANCE

    private object SingleTest {
         val TEST_INSTANCE = Test
    }

}

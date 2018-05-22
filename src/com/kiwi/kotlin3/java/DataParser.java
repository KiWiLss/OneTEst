package com.kiwi.kotlin3.java;

import java.util.List;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: DataParser
 * Author:   kiwilss
 * Date:     2018/5/22 10:38
 * Description: dataparser
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface DataParser<T> {

    void parseData(String input, List<T>output,List<String>errors);



}

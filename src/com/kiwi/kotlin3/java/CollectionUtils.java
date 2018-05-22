package com.kiwi.kotlin3.java;

import java.util.List;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: CollectionUtils
 * Author:   kiwilss
 * Date:     2018/5/22 09:32
 * Description: collection
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class CollectionUtils {
    public static List<String> uppercaseAll(List<String>items){
        for (int i = 0; i < items.size(); i++) {
            items.set(i,items.get(i).toUpperCase());
        }
        return items;
    }
}

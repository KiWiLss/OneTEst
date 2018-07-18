package com.kiwi.zt.project1.prject2;

import kotlin.io.FilesKt;
import kotlin.text.Charsets;

import java.io.File;
import java.nio.charset.Charset;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: MainJava
 * Author:   kiwilss
 * Date:     2018/7/17 15:00
 * Description: main java
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class MainJava {
    public static void main(String[] args) {
        File file = new File("Project2.iml");
        String content = FilesKt.readText(file, Charsets.UTF_8);
        System.out.println(content);
    }
}





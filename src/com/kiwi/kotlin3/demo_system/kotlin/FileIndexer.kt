package com.kiwi.kotlin3.demo_system.kotlin

import com.kiwi.kotlin3.java.DataParser
import com.kiwi.kotlin3.java.FileContentProcessor
import java.io.File

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: FileIndexer
 * Author:   kiwilss
 * Date:     2018/5/22 10:34
 * Description: fileindexer
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
class FileIndexer : FileContentProcessor {
    override fun processContents(path: File?, binaryContents: ByteArray?, textContents: MutableList<String>?) {

    }
}

class PersonParser : DataParser<Person> {
    override fun parseData(input: String?, output: MutableList<Person>?, errors: MutableList<String>?) {

    }
}



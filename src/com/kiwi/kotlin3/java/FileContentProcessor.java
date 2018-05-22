package com.kiwi.kotlin3.java;

import java.io.File;
import java.util.List;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: FileContentProcessor
 * Author:   kiwilss
 * Date:     2018/5/22 10:27
 * Description: filecontentprocessor
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public interface FileContentProcessor {

    void processContents(File path, byte[] binaryContents, List<String>textContents);

}

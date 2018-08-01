package com.kiwi.jujy.five;

import java.io.File;
import java.util.List;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: FileContentProcessor
 * Author:   kiwilss
 * Date:     2018/8/1 14:07
 * Description: interface
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface FileContentProcessor {
    void processContents(File path, byte[]binaryContents, List<String>textContents);


}

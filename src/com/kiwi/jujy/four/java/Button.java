package com.kiwi.jujy.four.java;

import com.kiwi.jujy.two.open.View;

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: Button
 * Author:   kiwilss
 * Date:     2018/7/20 13:39
 * Description: button
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class Button extends View{
    public void setOnClickListener(OnClickListener listener){
        listener.onClick(this);
    }


}

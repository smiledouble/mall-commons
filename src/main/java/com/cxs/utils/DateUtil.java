package com.cxs.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:chenxiaoshuang
 * @Date:2019/4/9 20:10
 */
public class DateUtil {
    private static SimpleDateFormat sdf = new SimpleDateFormat();

    /**
     * 输入指定的格式返回
     *
     * @param pattern
     * @return
     */
    public static String getWantedStr(String pattern) {
        sdf.applyPattern(pattern);
        Date date = new Date();
        String result = sdf.format(date);
        return result;

    }

}

package com.lida.util;

/**
 * @author join wick
 * @version 1.0.0
 * @description String Util
 * @createDate 2021/3/10 14:58
 * @since 1.0.0
 */
public class StringUtil {

    private StringUtil() {}

    /**
     * check whether the str is blank
     *
     * @param str String
     * @return boolean True-Blank
     */
    public static boolean isBlank(String str) {
        return null == str || str.length() == 0;
    }
}

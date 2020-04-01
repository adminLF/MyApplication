package com.xxfc.mylibrary;

import android.text.TextUtils;

import java.util.regex.PatternSyntaxException;

public class StringUtils {

    public static boolean isChinaPhone(String str)
            throws PatternSyntaxException {
        if (TextUtils.isEmpty(str)) {
            return false;
        }

        return str.length() == 11 && str.startsWith("1");
    }
}

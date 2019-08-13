package com.yss.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {
    //日期转字符
    public static String data2String(Date data, String patt) {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        String format = sdf.format(data);
        return format;
    }

    //    字符转日
    public static Date String2Data(String data, String patt) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        Date parse = sdf.parse(patt);
        return parse;
    }
}

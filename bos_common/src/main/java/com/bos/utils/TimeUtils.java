package com.bos.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
    /**
     * 将时间类型的时间转换为字符转类型的时间
     * @param date
     * @return
     */
    public static String Date2StringDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String stringDate = sdf.format(date);
        return stringDate;
    }

    /**
     * 将字符串类型的时间转换为时间类型的时间
     * @param stringDate
     * @return
     * @throws ParseException
     */
    public static Date stringDate2Date(String stringDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}

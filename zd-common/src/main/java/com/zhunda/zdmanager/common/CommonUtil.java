package com.zhunda.zdmanager.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zj on 2016/12/31 0031.
 * 公共类
 */
public class CommonUtil {

    /**
     * 毫秒转换成日期字符串
     *
     * @param timeMills
     * @return
     */
    public static String tansMillSToDate(long timeMills) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dt = new Date(timeMills);
        return simpleDateFormat.format(dt);
    }
}

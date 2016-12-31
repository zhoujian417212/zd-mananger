package com.zhunda.zdmanager.common;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zj on 2016/12/31 0031.
 */
public class CommonUtilTest {

    Logger logger = LoggerFactory.getLogger(CommonUtilTest.class);

    @Test
    public void testTransMillToDateStr() {

        String s = CommonUtil.tansMillSToDate(System.currentTimeMillis());
        logger.info(s);

    }


}

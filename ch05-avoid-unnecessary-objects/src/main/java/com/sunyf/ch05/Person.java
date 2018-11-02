package com.sunyf.ch05;

import com.sun.org.apache.xml.internal.security.keys.content.MgmtData;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @program: affective-java
 * @description: 避免创建不必要的对象
 * @author: Mr.Sun
 * @create: 2018-11-02 12:19
 **/
public class Person {

    private final Date birthDate = null;

    private static final Date BOOM_BGN;
    private static final Date BOOM_END;

    static {
        // 实例化一次，不用每次调用实例化
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_BGN = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_END = gmtCal.getTime();
    }

    public boolean isBabyBoomer() {
        // 检查是否出生于1946年到1964年
        return birthDate.compareTo(BOOM_BGN) >= 0 && birthDate.compareTo(BOOM_END) < 0;
    }


}

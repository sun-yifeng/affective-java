package com.sunyf.ch01;

/**
 * @program: affective-java
 * @description: 用静态方法代替构造方法
 * @author: Mr.Sun
 * @create: 2018-11-01 16:59
 **/
public class StaticMethod {

    public static Boolean valueOf(boolean b){
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}

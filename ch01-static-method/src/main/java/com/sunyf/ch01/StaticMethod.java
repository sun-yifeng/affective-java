package com.sunyf.ch01;

/**
 * @program: affective-java
 * @description: 用静态方法代替构造方法
 * 好处：
 * 1、见名知义；
 * 2、单例模式；
 * 3、可以返回子类对象？
 *
 * @author: Mr.Sun
 * @create: 2018-11-01 16:59
 **/
public class StaticMethod {

    public static Boolean valueOf(boolean b){
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}

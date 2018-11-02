package com.sunyf.ch05;

/**
 * @program: affective-java
 * @description: 自动拆箱
 * @author: Mr.Sun
 * @create: 2018-11-02 13:42
 **/
public class AutoBoxing {

    public static void main(String[] args) {
        long sum = 0L; // 0.7秒
        //Long sum = 0L; // 9秒多
        long l1 = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l1);
        System.out.println(sum);
    }

}

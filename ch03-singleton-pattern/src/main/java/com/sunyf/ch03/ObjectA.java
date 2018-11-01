package com.sunyf.ch03;

public class ObjectA {

    // 饿汗模式（立即加载）可以加final
    private static ObjectA myObject = new ObjectA();

    public ObjectA() {
        // do noting
    }

    public static ObjectA getInstance() {
        return myObject;
    }
}

package com.sunyf.ch03;

public class ObjectB {
    // 懒汉模式（延时加载）
    private volatile static ObjectB myObject; // TODO 同步

    private ObjectB() {
    }

    public static ObjectB getInstance() {
        //try {
            //Thread.sleep(3000);
            synchronized (ObjectB.class) {  // TODO 同步
                if (myObject == null) {
                    myObject = new ObjectB();
                }
            }
       // } catch (InterruptedException e) {
       //     e.printStackTrace();
       // }
        return myObject;
    }
}

package com.sunyf.ch07;

import java.io.*;

/**
 * @program: affective-java
 * @description:
 * 1、避免使用终结方法
 * 2、显示的定义终结方法，与try-catch-finally结合使用
 * @author: Mr.Sun
 * @create: 2018-11-02 15:22
 **/
public class Foo {

    public static void main(String[] args) {
        // 项目的路径
        String path = System.getProperty("user.dir");
        InputStream in;
        try {
            File f = new File(path + "/README.md");
            in = new FileInputStream(f);
            // 字节数组
            byte[] b = new byte[1024];
            while ((in.read(b)) != -1)  {
                // 字节转为字符
                System.out.println(new String(b));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //in.close();
        }

    }

}

package com.sunyf.ch03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @program: affective-java
 * @description: 枚举实现单例模式
 * @author: Mr.Sun
 * @create: 2018-11-01 20:02
 **/
public class ObjectC {

    // 枚举类
    public enum MyEnum {

        connectionFactory;

        private Connection connection;

        private MyEnum(){ // FIXME:枚举实际上是类，这里是构造方法
            try {
                System.out.println("创建MyObject对象");
                String url = "jdbc:sqlserver://localhost:1079;databaseName=mydb";
                String username = "sa";
                String password = "";
                String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
                Class.forName(driverName);
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public Connection getConnection(){
            return connection;
        }

    }

    public static  Connection getConnection(){
        return MyEnum.connectionFactory.getConnection();
    }
}

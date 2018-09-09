package com.mjie.classloader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author panmingjie
 * @date 2018/9/6 22:41
 */
public class NyTest26 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pmj", "root", "root");
        Statement statement = connection.createStatement();
    }
}

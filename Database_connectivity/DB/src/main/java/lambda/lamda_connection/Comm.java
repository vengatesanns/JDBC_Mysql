package com.lamda.lambda_connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class Comm {

    static Connection lb_conn = null;

    private Comm() {
    }

    public static Connection getDBConnection() {

        try {
            if (lb_conn == null) {
                Class.forName("com.mysql.jdbc.Driver");
                lb_conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
                 // System.out.println(lb_conn);
        return lb_conn;
    }
}
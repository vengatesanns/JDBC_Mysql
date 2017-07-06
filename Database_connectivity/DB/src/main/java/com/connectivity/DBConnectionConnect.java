package com.connectivity;
import java.sql.*;


public class DBConnectionConnect 
{
    public static void main(String[] args) {
        Connection conn = DBConnection.getDBConnection();
        //Preparedstatement statement;
        try {
            String query = "select * from student";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
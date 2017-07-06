package com.connectivity;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.*;
class insert
{
    Connection con1=DBConnection.getDBConnection();
    static String name,platform;
   static String price;
 
  static public void get_values()
   {
          Scanner v=new Scanner(System.in);
  System.out.println("Enter the Game Title");
  name=v.nextLine();
  System.out.println("Enter the Game Price");
  price=v.nextLine();
  System.out.println("Enter the Platform");
  platform=v.nextLine();
   }
public void insert()
{
try 
{
    get_values();
    String insert_query="insert into scientific(Gname,Gprice,platform) values('"+name+"','"+price+"','"+platform+"')";
    Statement s=con1.createStatement();
    PreparedStatement ps=con1.prepareStatement(insert_query);
    ps.executeUpdate(insert_query);
}
catch(Exception ex)
{
    ex.printStackTrace();
}
}
   public static void main(String args[])
   {

      System.out.println("Choose ur operation!!!");
   //   int op;
     // switch(op)
   //   {
   //       
   //   }





   }



}
package com.connectivity;
import java.util.*;
import java.io.*;
import java.sql.*;
public class Db_csv
{
  public static void main(String args[])
  {
    read();
    upload();
    download();
}
public static void upload()
{
Connection conn=DBConnection.getDBConnection();
  try 
{    //String val= "ENCLOSED BY '"';
                String loadQuery = "LOAD DATA LOCAL INFILE '" + "C://Users//vengatesan.n//Downloads//scientific (2).csv" + "' INTO TABLE scientific FIELDS TERMINATED BY ','"  +  " LINES TERMINATED BY '\n' (id, gname,gprice,platform) ";
                System.out.println(loadQuery);
                Statement stmt = conn.createStatement();
                stmt.execute(loadQuery);
                System.out.println("Upload successfully");
        }
      catch (Exception e)
        {
                e.printStackTrace();
        }
}
static public void read()
{
  int i=1;
  try
  {
   Scanner scanner = new Scanner(new File("C://Users//vengatesan.n//Downloads//scientific (5).csv"));
        scanner.useDelimiter(",");
        
        while(scanner.hasNext()){
            System.out.print(scanner.next()+"-");
      ++i;
       }
        scanner.close();
         System.out.println(i);
  }
  catch(Exception ex)
  {
    ex.printStackTrace();
  }
}
static void download()
{
Connection conn=DBConnection.getDBConnection();
  try 
{  
                String loadQuery = "SELECT * FROM scientific INTO OUTFILE '" + "C://Users//vengatesan.n//Downloads//scientific (5).csv" + "'  FIELDS TERMINATED BY ','"  +  " LINES TERMINATED BY '\n' ";
                System.out.println(loadQuery);
                Statement stmt = conn.createStatement();
                stmt.execute(loadQuery);
                System.out.println("DOWNLOADED successfully");
        }
      catch (Exception e)
        {
                e.printStackTrace();
        }
}
}
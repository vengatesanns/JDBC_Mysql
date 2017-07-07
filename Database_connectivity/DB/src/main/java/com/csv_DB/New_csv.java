package com.csv_DB;
import java.util.List;
import com.opencsv.*;
import java.io.FileReader;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.*;
import com.connectivity.DBConnection;
import java.sql.*;
import com.connectivity.*;
import com.games.Games;
//import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import java.io.*;
import java.lang.*;

public class New_csv
{
public static void main(String a[]) throws IOException
{
    Db_csv test=new Db_csv();
   CSVReader cr=null;
   String sql="";
     try {
         cr=new CSVReader(new FileReader("C://Users//vengatesan.n//Downloads//scientific (2).csv"),',','"');
         ColumnPositionMappingStrategy<Games> beanStrategy=new ColumnPositionMappingStrategy<Games>();
         beanStrategy.setType(Games.class);
        beanStrategy.setColumnMapping(new String[] {"id","gname","gprice","platform"});
         CsvToBean<Games> cs=new CsvToBean<Games>();
         List<Games> gamelist=cs.parse(beanStrategy,cr);     
         System.out.println(gamelist);
         try{
         test.upload();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

      //   for (Games e : gamelist) {
//sql += "INSERT INTO `games`(`id`,`gname`, `gprice`, `platform`) VALUES ('" + e.getID() + "',"
//+ "'"+ e.getgname() + "'," + "'"+ e.getgprice()+ "'"+ "," + "'"+ e.getplatform() +"'"+ ");";

} 

     catch (Exception err) {
     
     err.printStackTrace();    

 }

finally
{
     try 
     {
         cr.close();
     }
     catch (Exception err)
      {
         System.out.println(err);
         err.printStackTrace();
     }
}

}
}
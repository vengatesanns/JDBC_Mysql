package com.connectivity;
import java.util.List;
import com.opencsv.*;
import java.io.FileReader;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.*;
//import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import java.io.*;
import java.lang.*;

public class New_csv
{
public static void main(String a[]) throws IOException
{
   CSVReader cr=null;
     try {
         cr=new CSVReader(new FileReader("C://Users//vengatesan.n//Downloads//vv.csv"),',');
         ColumnPositionMappingStrategy<Games> beanStrategy=new ColumnPositionMappingStrategy<Games>();
         beanStrategy.setType(Games.class);
        beanStrategy.setColumnMapping(new String[] {"id","gname","gprice","platform"});
         CsvToBean<Games> cs=new CsvToBean<Games>();
         List<Games> gamelist=cs.parse(beanStrategy,cr);     
         System.out.println(gamelist);
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
/*package com.csvreading;
import java.util.List;
import java.util.ArrayList;
import com.opencsv.*;
import java.io.FileReader;
import java.io.*;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import java.io.IOException;
class Reading
{
    public static void main(String a[]) throws IOException
    {
        try{
       CSVReader csv_r=new CSVReader(new FileReader("C://Users//vengatesan.n//Downloads//v.csv"),',');
       List<Games> g_list=new ArrayList<Games>();
      //  String line = "";
    //String cvsSplitBy = '"';
       String val[]=null;

       while((val=csv_r.readNext())!=null)
       {
         Games gg=new Games();
        gg.setID(val[0]);
         gg.setgname(val[1]);
         gg.setprice(val[2]);
         gg.setplatform(val[3]);
         g_list.add(gg);
       }
System.out.println(g_list);
csv_r.close();
}
catch(Exception ex)
{
    ex.printStackTrace();
}
    }
}
*/
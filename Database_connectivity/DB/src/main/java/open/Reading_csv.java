package open;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import com.opencsv.bean.CsvToBean;
import java.io.*;
import java.util.*;
class Reading_csv
{

public static void main(String args[]) throws IOException
{
     CSVReader cr=null;
    try{
      cr=new CSVReader(new FileReader("D://Emp.csv"),',');
    ColumnPositionMappingStrategy<Games> cm=new ColumnPositionMappingStrategy<Games>();
    cm.setType(Games.class);
    cm.setColumnMapping( new String[]{"id","name"});
    CsvToBean<Games> cb=new CsvToBean<Games>();
    List<Games> data=cb.parse(cm,cr);
    System.out.println(data);
   cr.close();
}
catch(Exception ex)
{
    ex.printStackTrace();
}

}




}
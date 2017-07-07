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
    ColumnPositionMappingStrategy<Games1> cm=new ColumnPositionMappingStrategy<Games1>();
    cm.setType(Games1.class);
    cm.setColumnMapping( new String[]{"id","name"});
    CsvToBean<Games1> cb=new CsvToBean<Games1>();
    List<Games1> data=cb.parse(cm,cr);
    System.out.println(data);
   cr.close();
}
catch(Exception ex)
{
    ex.printStackTrace();
}

}




}
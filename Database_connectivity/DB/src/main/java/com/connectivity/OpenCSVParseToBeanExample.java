/*package com.connectivity;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

//import com.journaldev.csv.model.Employee;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

public class OpenCSVParseToBeanExample {

	public static void main(String[] args) throws IOException {
		
		CSVReader reader = new CSVReader(new FileReader("C://Users//vengatesan.n//Downloads//v.csv"), ',');
		
		ColumnPositionMappingStrategy<Games> beanStrategy = new ColumnPositionMappingStrategy<Games>();
		beanStrategy.setType(Games.class);
		beanStrategy.setColumnMapping(new String[] {"id","gname","gprice","platform"});
		
		CsvToBean<Games> csvToBean = new CsvToBean<Games>();
		
		List<Games> emps = csvToBean.parse(beanStrategy, reader);
		
		System.out.println(emps);
		
	}
}
*/
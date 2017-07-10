


class Data_Process
{

      public void downloading()
      {
    Connection conn=DBConnection.getDBConnection();
  try 
{  
                String loadQuery = "SELECT * FROM details INTO OUTFILE '" + "C://Users//vengatesan.n//Downloads//Books.csv" + "'  FIELDS TERMINATED BY ','"  +  " LINES TERMINATED BY '\n' ";
               // System.out.println(loadQuery);
                Statement stmt = conn.createStatement();
                stmt.execute(loadQuery);
                System.out.println("DOWNLOADED successfully");
        }
      catch (Exception e)
        {
                e.printStackTrace();
        }
      }
       public dataReading()
       {
           CSVReader read=new CSVReader(new FileReader("C://Users//vengatesan.n//Downloads//scientific (2).csv"),',','"');
       ColumnPositionMappingStrategy cm=new ColumnPositionMappingStrategy();
       cm.setType(User_data.class);
       


       }



}
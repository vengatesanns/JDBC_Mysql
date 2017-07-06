package com.connectivity;
public class Games
{
   String id,gname,gprice,platform; 
    //getter 
    //setter
  public String getID()
  {
    return id;
  }
  public void setID(String id)
  {
    this.id=id;
  }
  public String getgname()
  {
    return gname;
  }
  public void setgname(String gname)
  {
    this.gname=gname;
  }
  
  public String getgprice()
  {
    return gprice;
  }
  public void setgprice(String gprice)
  {
    this.gprice=gprice;
  }
  
  public String getplatform()
  {
    return platform;
  }
public void setplatform(String platform)
  {
    this.platform=platform;
  }
 



  public String toString()
  {
    return  id +" "+ gname+ " "+gprice+" "+platform;
  }
  //public static void main(String args[])
  //{
      //Games g=new Games();
    //  System.out.println(g);  


 // }


}
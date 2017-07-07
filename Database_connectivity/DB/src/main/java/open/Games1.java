package open;
public class Games1
{
   String id,name,gprice,platform; 
    
 
   //public Games(String gname,String gprice,String platform)
  //{

    //this.gname=gname;
    //this.gprice=gprice; 
    //this.platform=platform;  
  //}
  public String getID()
  {
    return id;
  }
  public void setID(String id)
  {
    this.id=id;
  }
  public String getname()
  {
    return name;
  }
  public void setname(String name)
  {
    this.name=name;
  }
  
 /* public String getprice()
  {
    return gprice;
  }
  public void setprice(String gprice)
  {
    this.gprice=gprice;
  }
  
  public String getplatform1()
  {
    return platform;
  }
public void set_platform1(String platform)
  {
    this.platform=platform;
  }
 */



  public String toString()
  {
    return  id +" "+ name;
  }
  //public static void main(String args[])
  //{
      //Games g=new Games();
    //  System.out.println(g);  


 // }


}
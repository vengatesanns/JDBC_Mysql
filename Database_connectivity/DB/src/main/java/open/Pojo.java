package open;
public class Pojo
{
    String id,name;
    public String getid()
{
    return id;
}
public String getname()
{
    return name;
}
public void setid(String id)
{
        this.id=id;
}
public void setname(String name)
{
    this.name=name;
}
public String toString()
{
    return id+" "+name;
}

//public static void main(String args[])
//{
//    Pojo p=new Pojo();
  //  System.out.println(p);
//}

}
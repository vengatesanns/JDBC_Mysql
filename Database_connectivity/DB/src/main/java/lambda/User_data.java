package lambda;
class User_data
{
String bName,bAuthor;
int id,bPrice;
public int getID()
{
    return id;
}
int setID(int id)
{
    this.id=id;
}
public String getbName()
{
    return bName;
} 
String setbName(String bName)
{
    this.bName=bName;
}
public int getbPrice()
{
    return bPrice;
}
int setbPrice(int bPrice)
{
    this.bPrice=bPrice;
}
public String getbAuthor()
{
    return bAuthor;
} 
String setbAuthor(String bAuthor)
{
    this.bAuthor=bAuthor;
}
public String toString()
{
        return id+" "+bName+" "+bPrice+" "+bAuthor;
}
}

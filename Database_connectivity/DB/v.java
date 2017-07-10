interface default2
{

public String show(String e);
static void dis()
{
System.out.println("vvvvv");
}
default void display()
{

System.out.println("vvvvv");

}
}
class v
{
static void cc()
{}
public static void main(String[] args) {
default2 f;
f=(String x)->{
return x;
};
System.out.println(f.show("Hai"));

f.display();
default2.dis();
v.cc();
//System.out.println();


}
}
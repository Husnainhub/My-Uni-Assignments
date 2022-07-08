class Addition
{
	int x;
}
class A extends Addition
{
	int x;
	A()
   {
        x=10;
	System.out.println("x="+x);
	super.x=20;
	System.out.print("x="+super.x);
   }
}
public class Superusing1
{
public static void main (String arg[])
  {
    A p=new A();
  }
}
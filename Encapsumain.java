class encapsulation1st
{
	private int x;
	
	public int getter_x()
	{
	    return x;	
	}
	public void setter_x(int a)
	{
		x = a;
	}
	
}
public class Encapsumain
{
	public static void main(String a[])
	{
		encapsulation1st obj = new encapsulation1st();
		obj.setter_x(10);
		obj.getter_x();
		System.out.println(obj.getter_x());
	}
}

class Array
{
	void display(int a[])
	{
		for(int i=0;i<=4;i++)
			System.out.println(a[i]);
	}
	
}

public class ArrayPractice1st
{
	public static void main(String arg[])
	{
		int x[] = {20,30,40,50,60};
		Array obj = new Array();
		obj.display(x);// x stores 2000
	}
}
class Addition
{
	private int x,y;
	//For X
	public void setx(int a)
	{
		x=a;
	}
	public int getx()
	{
		return x;
	}
	//For y
	public void sety(int a)
	{
		y=a;
	}
	public int gety()
	{
		return y;
	}
	
	
	public int add()
	{
		return x+y;
	}
}
public class PQ1
{
	public static void main(String args[])
	{
		Addition obj = new Addition();
		obj.setx(60);
		obj.sety(43);
		System.out.println(obj.add());
		
		
	}
}
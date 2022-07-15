class Circle
{
	float r;
	Circle(float a)
	{
		r=a;
	}
	
	public void setr(float a)
	{
		r=a;
	}
	
	public double getr()
	{
		return r;
	}
	
	public float getcircumference()
	{
		return 2f*3.14f*r;
	}
	
	public float getarea()
	{
			return 3.14f*r*r;
	}
}

public class PQ2
{
	public static void main(String a[])
	{
		Circle obj = new Circle(2.5f);
		//obj.setx(2.5);
		System.out.println("Circumference="+obj.getcircumference());
		System.out.println("Area="+obj.getarea());
	}
}
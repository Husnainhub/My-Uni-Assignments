interface Drawable 
{
	void draw();
}


class Rectangle implements Drawable
{                 public void draw()
	{	
	System.out.println("drawing Rectangle");
	}
}


class Circle implements Drawable 
{
	public void draw()
	{ 
	System.out.println("drawing Circle");
	}
}


public class Testinterface1
{
public static void main(String args[])
     {
	Rectangle  r = new Rectangle();
	Circle c = new Circle();
	r.draw();
	c.draw();
     }
}

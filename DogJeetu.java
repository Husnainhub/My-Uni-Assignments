class Dog
{
 	String color ="black";
	String name = "jeetu";
	
	void barking()
	{
	System.out.println(" dog is barking");
           


	}
}
public class DogJeetu
{

  public static void main (String args[])
	{
           Dog d1=  new Dog();
	   Dog d2=  new Dog();
		d2.color="red";
		d2.name="pet";
	    System.out.println(d1.color);
	    System.out.println(d1.name);
	    System.out.println(d2.color);
	    System.out.println(d2.name);
	    d1.barking();


        }

}
import java.util.Scanner;
public class ArrayPractice 
{
  public static void main(String args[])
 { 
   int a[],size,i,index;
   Scanner scan=new Scanner(System.in);
	System.out.print ("Size of Array: ");
	size= scan.nextInt();
	a = new int [size];
	System.out.print ("Enter Elements:\n");
	for(i=0;i<size;i++)
    {
       a[i]=scan.nextInt();
       //index=0;
    }
	
}
}
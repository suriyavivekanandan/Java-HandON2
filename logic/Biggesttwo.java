import java.io.*;
class Oddoreven
{
	public static void main (String arc[])
	{
		try
		{
			DataInputStream i=new DataInputStream(System.in);
			int a;
			System.out.println("enter a");
			a=Integer.parseInt(i.readLine());
			System.out.println("enter b");
		if (a%2==0)
		{
 			System.out.println(" a is even");
		}
	      if(a%2!=0)
		{
			System.out.println(" a is odd");
		}
	}
		catch (Exception e)
		{
			System.out.println(e);
		}
	
	}
}
import java.io.*;
class Add
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int a,b,c;
			System.out.println("Enter a");
			a=Integer.parseInt(t.readLine());
			System.out.println("Enter b");
			b=Integer.parseInt(t.readLine());
			c=a+b;
			System.out.println("Addition of two nos="+c);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
} 
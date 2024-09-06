import java.io.*;
class Multiplication
{	
	public static void main(String arg[])
	{
		try
		{
		DataInputStream q=new DataInputStream(System.in);
		int a,b,c;
		System.out.println("eneter a");
		a=Integer.parseInt(q.readLine());
		System.out.println("enter b");
		b=Integer.parseInt(q.readLine());
		c=a+b;
		System.out.println("ans="+c);
		}
		 	catch (Exception e)
			{
			 System.out.println(e);
			}


  	}
}
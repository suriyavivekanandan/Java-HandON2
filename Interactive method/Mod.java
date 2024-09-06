import java.io.*;
class Mod
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream y=new DataInputStream(System.in);
			int a,b,c;
			System.out.println("enter a");
			a=Integer.parseInt(y.readLine());
			System.out.println("enter b");
			b=Integer.parseInt(y.readLine());
			c=a+b;
			System.out.println("answer is+"+c);
		}
		 catch (Exception e)
			{
				System.out.println(e);
			}
         }
}
			
	
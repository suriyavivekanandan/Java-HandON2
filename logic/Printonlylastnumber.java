import java.io.*;
class Printonlylastnumber
{
	public static void main(String arc[])
	{
		try
		{
			DataInputStream i=new DataInputStream(System.in);
			double a;
			System.out.println("a=");
			a=Double.parseDouble(i.readLine());
			a=a%1000;
			System.out.println("a="+a);
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}
			
			
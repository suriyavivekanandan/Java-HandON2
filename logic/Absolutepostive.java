import java.io.*;
class Absolutepostive
{
	public static void main(String arc[])
	{
		try
		{
			DataInputStream i=new DataInputStream(System.in);
			double a,b;
			System.out.println("enter a");
			a=Double.parseDouble(i.readLine());
			a=Math.pow(a,2);
                        b=Math.sqrt(a);
                        
			System.out.println("a="+b);
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
}
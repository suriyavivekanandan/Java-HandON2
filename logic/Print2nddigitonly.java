import java.io.*;
class Print2nddigitonly
{
	public static void main(String arc[])
	{
	try
		{
			DataInputStream i=new DataInputStream(System.in);
			int a,c;
			System.out.println("enter 4 digit number");
			a=Integer.parseInt(i.readLine());
			c=(a/100)%10;
			System.out.println(c);
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
		}
}
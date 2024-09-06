import java.io.*;
class Areaeqtriangle
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream j=new DataInputStream(System.in);
			double a,e;
			System.out.println("a=");
			a=Double.parseDouble(j.readLine());
			e=Math.sqrt(3)*((Math.pow(a,2))/4);
			System.out.println("e="+e);
		}
			catch (Exception e)
			


			
			{
			   System.out.println(e);
			
			}
	}
}
			
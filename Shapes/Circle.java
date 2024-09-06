import java.io.*;
class Circle
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream j=new DataInputStream(System.in);
			double r,e,p;
			System.out.println("r=");
			r=Double.parseDouble(j.readLine());
			e=3.14*Math.pow(r,2);
			p=2*3.14*r;
			System.out.println("e="+e);
			System.out.println("p="+p);
			
			
		}
			catch (Exception e)
			


			
			{
			   System.out.println(e);
			
			}
	}
}
			
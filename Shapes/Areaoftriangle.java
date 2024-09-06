import java.io.*;
class Areaoftriangle
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream j=new DataInputStream(System.in);
			double e,b,h;
			System.out.println("enter b of Triangle");
			b=Double.parseDouble(j.readLine());
			System.out.println("enter l of Tringle");
			h=Double.parseDouble(j.readLine());
			e=(1.0/2.0)*(b*h);
			System.out.println("area of Triangle="+e);
			}
				catch(Exception e)
				{
					System.out.println(e);
				}
	}
}
			
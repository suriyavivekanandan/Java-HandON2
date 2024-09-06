import java.io.*;
class Findreminderwithoutmodules
{
	public static void main(String arg[])



	{
		try
		{
			DataInputStream j=new DataInputStream(System.in);
			int a,b,c,d;
			System.out.println("a=");
			a=Integer.parseInt(j.readLine());
			System.out.println("b=");
			b=Integer.parseInt(j.readLine());
		        c=a/b;
                        d=a-(c*b);
            System.out.println("c="+c);
            System.out.println("d="+d);
			
			
		}
			catch (Exception e)
			


			
			{
			   System.out.println(e);
			
			}
	}
}
			
import java.io.*;
class Mul
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream r=new DatainputStream(System.in);
			int x,y,z;
			System.out.println("eneter the value of x =");
			x=Integer.parseInt(r.readLine());
			System.out.println("enter the value of y =");
			y=Integer.parseInt(r.readLine());
			z=x*y;
			System.out.println("the answer is="+z);
		}
		  catch(Expection e)
                  {
			System.out.println(e);
		  }	
          }
}	
								
			




	
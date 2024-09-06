import java.io.*;
class Subraction
{
  	public static void main(String arg[])
	{
		try
	 	{
			DataInputStream t=new DataInputStream(System.in);
			int a,b,c;
			System.out.println("enter the valuve of a=");
			a=Integer.parseInt(t.readLine());
			System.out.println("enter the value of b=");
			b=Integer.parseInt(t.readLine());
                	c=a-b;
			System.out.println("ans c="+c);
         	}
		catch(Exception e)
	   	{
             		 System.out.print(e);
	  	}
 	}
}
     

          
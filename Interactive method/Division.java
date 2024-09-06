import java.io.*;
class Division
{
		public static void main(String arg[])

	{
                   try
                     
		   {
			DataInputStream q=new DataInputStream(System.in);
 			int a,b,c;
			System.out.println("enter a");
			a=Integer.parseInt(q.readLine());
			System.out.print("enter b");
         		b=Integer.parseInt(q.readLine());
			c=a/b;
			System.out.println("ans is="+c);
		    }
			catch (Exception e)
			{
				System.out.println(e);
			}
	  }
}
import java.io.*;
class Subtaction1
{
  	public static void main(String arg[])

  {
          try
	 {
		DataInputStream q=new DataInputStream(System.in);
		int a,b,c;
		System.out.println("enter the valuve of a=");
		a=Int.parseInt(q.readLine());
		System.out.println("enter the value of b=");
		b=Int.parseInt(q.readLine());
                c=a-b;
		System.out.println("ans c="+c);
          }

		catch(Exception e)
	   {
              System.out.print(e);
	   }
 }
}
     

          
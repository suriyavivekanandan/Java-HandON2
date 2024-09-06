import java.io.*;
class Sub
{
	public static void main(String arg[])
	{
	 	try
			{
				DataInputStream q=new DataInputStream(System.in);   
				int a,b,c;
				System.out.println("enter the value of a=");
				a=Integer.parseInt(q.readLine());
				System.out.println("enter the value of b=");
				b=Integer.parseInt(q.readLine());
				c=a-b;
				System.out.println("The Sub of two num is="+c);
			}
		
                           catch(Exception e)
				{
                                  System.out.println(e);
				}
	                   

                       }
}



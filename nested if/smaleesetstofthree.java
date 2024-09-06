import java.io.*;
class smaleesetstofthree
{
	public static void main(String arc[])
	{
		try
		{
		DataInputStream i=new DataInputStream(System.in);
		int a,b,c;
		System.out.println("enter the value of a");
		a=Integer.parseInt(i.readLine());
		System.out.println("enter the value of b");
		b=Integer.parseInt(i.readLine());
		System.out.println("enter the value of c");
		c=Integer.parseInt(i.readLine());
		if(a<b)
			{
				if(a<c)
					{
						System.out.println("a is smallest");
					}
				else{
					
						System.out.println("c is smallest");
					}
			}		
			else
			{
				if(b<c)
				{
					System.out.println("b is smallest");
				 }
				else
				{
					System.out.println("c iis smallest");
				}
			   }
			}
		                catch (Exception e)
			{ System.out.println(e);
			}
}
}
		
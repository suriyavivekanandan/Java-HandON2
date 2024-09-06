import java.io.*;
class equal
{
	public static void main(String arc[])
	{
		try
		{ 

		DataInputStream i=new DataInputStream(System.in);
		int a,b,c,d;
		System.out.println("enter the value of a");
		a=Integer.parseInt(i.readLine());
		System.out.println("enter the value of b");
		b=Integer.parseInt(i.readLine());
		System.out.println("enter the value of c");
		c=Integer.parseInt(i.readLine());
		if(a==b&&b==c&&c==a)
			{
				System.out.println("its equal tringle");
			}
				else
					{
						if(a==b||a==c||b==c)
						{
							System.out.println("its isoline tringle");
						}
					     else
						{
							if(a!=b&&b!=c&&c!=a)
							{
						System.out.println("its scal tringle");
						       }
			}
			
			}
}
catch (Exception e)
			{ System.out.println(e);
			}
}
}
		
		
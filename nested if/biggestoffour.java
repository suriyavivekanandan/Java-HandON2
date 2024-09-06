import java.io.*;
class biggestoffour
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
		System.out.println("enter the value of d");
		d=Integer.parseInt(i.readLine());
              if(a>b)
			{
				if(a>c)
					{
						if(a>d)
						{
								System.out.println( "a is biggest");
						}
						else
						{
									System.out.println( "d is biggest");
					         }
					}
				else
				{
					if(c>d)
						{
								System.out.println( "c is biggest");
						}
						else
						{
									System.out.println( "d is biggest");
					         }
				}
			}
			else
			{
					if(b>c)
						{
							if(b>d)
								{
									System.out.println( "b is biggest");
								}
							else
								{
									System.out.println( "d is biggest");
								}
						}`
						else
						{
							if(c>d)
							{
								System.out.println( "c is biggest");
							}
							else
							{
									System.out.println( "d is biggest");
					         	}
						}
					}
}
		catch (Exception e)
			{ System.out.println(e);
			}
}
}
		
		
				
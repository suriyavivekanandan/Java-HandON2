import java.io.*;
class Leapyear
{
	public static void main(String arg[])
	{
		try
			{
				DataInputStream i=new DataInputStream(System.in);
				Double a;
				System.out.println("enter the year");
				a=Double.parseDouble(i.readLine());
				if(a%4==0&&a%100!=0)

				{
					System.out.println("ITS LEAP YEAR");
				}
				else
					{
						if(a%400==0)
						{
							System.out.println("ITS LEAP YEAR");
						}
						else
						{
							System.out.println("not LEAP YEAR");
						}
					}
				}
					catch (Exception e)
			{ System.out.println(e);
			}
}
}
		
						


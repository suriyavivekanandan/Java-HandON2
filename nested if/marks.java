import java.io.*;
class marks
{
	public static void main(String arg[])
	{
		try
		{
		DataInputStream i=new DataInputStream(System.in);
		int a,b,c,d,e,avg;
		System.out.println("enter tamil mark");
		a=Integer.parseInt(i.readLine());
		System.out.println("enter the value of englidh");
		b=Integer.parseInt(i.readLine());
		System.out.println("enter the value of maths");
		c=Integer.parseInt(i.readLine());
		System.out.println("enter the value of science");
		d=Integer.parseInt(i.readLine());
		System.out.println("enter the value of soc");
		e=Integer.parseInt(i.readLine());
			avg=((a+b+c+d+e)/5);
		if(a>=35&&b>=35&&c>=35&&d>=35&&e>=35)
		{
			System.out.println(" pass");
		}
		else
		{
			System.out.println(" fail");
		}
		if(avg>=90)
					{
					 System.out.println(" a grade");
					}
		else
		{
			if(avg<90&&avg>80)
			{
				System.out.println("bgrade");
			}
				else
					{
						if(avg<80&& avg>70)
						{
							System.out.println("c grade");
						}
				else
					{
						if(avg<70&&avg>50)
						{
							System.out.println("d grade");
						}
						else
						{
							System.out.println("no grade");
							}
					}
				}
			}
		}
			catch (Exception e)
			{ System.out.println(e);
			}
}
}
		

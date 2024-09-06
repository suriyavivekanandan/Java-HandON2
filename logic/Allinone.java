import java.io.*;
class Allinone
{
	public static void main(String arc[])
	{
	try
		{
			DataInputStream i=new DataInputStream(System.in);
			int a,b,c,d,e,f;
			System.out.println("enter 4 digit number");
			a=Integer.parseInt(i.readLine());
			b=a%10;
			System.out.println("last digit of number="+b);
			c=a/1000;
			System.out.println("first digit of number="+c);
			d=(a/100)%10;
			System.out.println("Second digit of number="+d);
			e=(a/10)%10;
			System.out.println("third digit of number="+e);
			f=b*1+e*100+d*10+1000*c;
			System.out.println(f);
			
		}

			catch(Exception e)
			{
				System.out.println(e);
			}
		
	}
}
import java.io.*;
class Summ1
{
	public static void main(String arc[])
	{
	 	try
			{
				DataInputStream i=new DataInputStream(System.in);
				int sp,x,y;
				System.out.println("enter x=");
				x=Integer.parseInt(i.readLine());
				System.out.println("enter y=");
				y=Integer.parseInt(i.readLine());
				sp=(x+y)+x;
				System.out.println("Answer is ="+sp);
			}
			catch (Exception e)
				{
					System.out.println(e);
				}
		}
}
				
				
				
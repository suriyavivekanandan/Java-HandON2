import java.io.*;
class Sumone
{
	public static void main(String arg[])
		{
			try
				{
					DataInputStream i=new DataInputStream(System.in);
					int a,b,c,d,n;
					System.out.println("enter the first value");
					a=Integer.parseInt(i.readLine());
					System.out.println("enter the second value");
					b=Integer.parseInt(i.readLine());
				
					while(a<=b)
							
						{
							
							n=a;
							c=0;
							d=0;
	                                                           while(n!=0)
											{
													c=n%10;
													d=d*10+c;
													n=n/10;
											}
												
								if(d==a)
									{
										
										System.out.println("palindrome="+a);
									}
										
							}
				}



catch(Exception e)
{
	System.out.println(e);
}
}
}

				

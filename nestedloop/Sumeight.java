import java.io.*;
class Sumeight
{
	public static void main(String arg[])
		{
			try
				{
					DataInputStream j=new DataInputStream(System.in);
					int a=0,b,c,d,n,e,f,g,h,i,z,x,m;
					System.out.println("enter the first value");
					a=Integer.parseInt(j.readLine());
					System.out.println("enter the second value");
					b=Integer.parseInt(j.readLine());
				
					while(a<=b)
							
						{
							
							n=a;
							m=10;
							i=1;
	                                                                         while(i<=m)
											{
												c=i*n;
												
												System.out.println( i+"x"+n+"="+c);
												i++;

											}
											
						                               				
								
									
										a++;
							}
				}



catch(Exception e)
{
	System.out.println(e);
}
}
}

				

import java.io.*;
class Sumfour
{
	public static void main(String arg[])
		{
			try
				{
					DataInputStream j=new DataInputStream(System.in);
					int a,b,c,d,n,e,f,g,h,i,z;
					System.out.println("enter the first value");
					a=Integer.parseInt(j.readLine());
					System.out.println("enter the second value");
					b=Integer.parseInt(j.readLine());
				
					while(a<=b)
							
						{
							
							n=a;
							f=(int)Math.pow(n,2);
							c=0;
							d=0;
							i=1;
							z=0;
							e=0;g=0;h=0;
	                                                           while(f!=0)
											{
												c=f%10;
												d=d*10+c;
												f=f/10;
											}
											e=(int)Math.sqrt(d);
	
									while(e!=0)
											{
											g=e%10;
											h=h*10+g;
											e=e/10;
											
												}

												
								if(h==a)
									{
										
										System.out.println("adam="+a);
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

				

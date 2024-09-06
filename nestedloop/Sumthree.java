import java.io.*;
class Sumthree
{
	public static void main(String arg[])
		{
			try
				{
					DataInputStream j=new DataInputStream(System.in);
					int a,b,c,d,n,i,k,e,z;
					System.out.println("enter the first value");
					a=Integer.parseInt(j.readLine());
					System.out.println("enter the second value");
					b=Integer.parseInt(j.readLine());
				
					while(a<=b)
							
						{
							
							n=a;
							k=n;
							c=0;
							d=0;
							i=1;
							z=0;
							e=0;
	                                                           while(n!=0)
											{
												n=n/10;
												z++;
											}
									while(k!=0)
											{
											e=k%10;
											d=d+(int)Math.pow(e,z);
											k=k/10;
											
												}

												
								if(d==a)
									{
										
										System.out.println("amstrong="+a);
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

				

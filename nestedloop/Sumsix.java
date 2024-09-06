import java.io.*;
class Sumsix
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
	                                                           while(n>0)
											{
												n=n/10;
												g++;
											
											}
											d=f %(int)(Math.pow(10,g));
						                               				
								if(d==a)
									{
										
										System.out.println("automorpic="+a);
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

				

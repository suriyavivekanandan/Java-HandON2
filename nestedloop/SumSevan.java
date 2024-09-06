import java.io.*;
class SumSevan
{
	public static void main(String arg[])
		{
			try
				{
					DataInputStream j=new DataInputStream(System.in);
					int a=0,b,c,d,n,e=0,f,g,h,i,z,x,m,p;
					System.out.println("enter the first value");
					a=Integer.parseInt(j.readLine());
					b=a;
			
					while(b!=0)
							
						{	p=b%10;
							c=1;
							d=1;
							

			
	                                                                     while(d<=p)
											{
												c=c*d;
												d++;
											}
							                                  e=e+c;	
											  b=b/10;
						}
							if(e==a)
									{			
						                               				
								        System.out.println("strong number");
									}
							  else
									{
										 System.out.println("not strong number");
									}

 
						}



catch(Exception e)
{
	System.out.println(e);
}
}
}


				

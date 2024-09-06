import java.io.*;
class patnine
{
public static void main(String arg[])
			{
				try
					{
						DataInputStream t=new DataInputStream(System.in);
						 	int i=1,n,j=0;
							System.out.println("enter the value of the n");
							n=Integer.parseInt(t.readLine());
							int a=i;
							int b=n-1;
							int c=j;
							while(i<=n)
								{
									j=1;
										while(j<=i)
											{


												System.out.print(j);
														j++;
											}

											
										

								System.out.println();
									i++;
						}
								i=1;
								b=n-1;

										while(i<=b)
								{
									j=1;
									
										while(j<=b)
											{


												System.out.print(j);
														j++;
											}

											
									
								System.out.println();
									b--;

								


}

		
				}

catch(Exception e)
{
	System.out.println(e);
}
}
}


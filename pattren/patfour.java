import java.io.*;
class patfour
{
public static void main(String arg[])
			{
				try
					{
						DataInputStream t=new DataInputStream(System.in);
						 	int i=1,n,j,a=0;
							System.out.print
("enter the value of the n");
							n=Integer.parseInt(t.readLine());
							while(i<=n)
								{
									j=1;
										while(j<=i)
											{
													a++;
													System.out.print(a);

												
														j++;
													
											
											}


								System.out.println();
									i++;
						}
				}

catch(Exception e)
{
	System.out.println(e);
}
}
}


import java.io.*;
class patone
{
public static void main(String arg[])
			{
				try
					{
						DataInputStream t=new DataInputStream(System.in);
						 	int i=1,n,j;
							System.out.println("enter the value of the n");
							n=Integer.parseInt(t.readLine());
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
				}

catch(Exception e)
{
	System.out.println(e);
}
}
}


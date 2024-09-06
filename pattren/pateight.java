import java.io.*;
class pateight
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


												if(j%2==0)
														{
															System.out.print("0");
														}
												else
														{
															System.out.print("1");
														}


															

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


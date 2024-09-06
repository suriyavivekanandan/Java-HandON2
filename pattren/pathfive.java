import java.io.*;
class pathfive
{
public static void main(String arg[])
			{
				try
					{
						DataInputStream t=new DataInputStream(System.in);
						 	int i=1,n,j,k;
							System.out.println("enter the value of the n");
							n=Integer.parseInt(t.readLine());
							while(i<=n)
								{
									k=n;
									while(k>=i)
									{
										System.out.print("*");
										k--;
									}
									j=i;
										while(j>=1)
											{


												System.out.print(j);
														j--;
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


import java.io.*;
class 
salescommsion
{
 	public static  void main(String arg[])
	{
		try
			{
				DataInputStream i=new DataInputStream(System.in);
				int a,b,c,d,e,f;
				System.out.println("enter the sales amount");
				a=Integer.parseInt(i.readLine());
				if(a<=10000)
					{
					b=a*0/100;
					System.out.println(" 	The comisson amount"+b);
					
					}
				else
					{
						if(a>10000&&a<=20000)
						{
						  c=a*5/100;
						System.out.println(" 	The comisson amount"+c);
						}
						else
							{
							     if(a>20000&&a<=50000)
								{
									 d=a*10/100;
									System.out.println(" 	The comisson amount"+d);
								}
							
								else
									{
										 if(a>50000&&a<=100000)
										{
											e=a*15/100;
											System.out.println(" The comisson amount"+e);
										}
										else
											{
													f=a*15/100+500;
													System.out.println(" The comisson amount"+f);
												
											}
									}
							}
				}
}
catch (Exception e)
			{ System.out.println(e);
			}
}
}
		
													
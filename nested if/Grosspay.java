import java.io.*;
class Grosspay
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream x=new DataInputStream(System.in);
			int a,b,c,d,e,f,g=0,i,j,k;
			System.out.println("enter the basic salarey");
			a=Integer.parseInt(x.readLine());
			if(a<=10000)	
				{
				 	b=a*20/100;
					System.out.println("HRA="+b);
					c=a*80/100;
					System.out.println("DA="+c);
					d=b+c;
					System.out.println("GROSS PAY AMOUNT="+d);
				}
			else
				{
					if(a>10000 && a<=20000)
			                   { 

						 e=(a*25/100);
						System.out.println("HRA="+e);
						f=(a*80/100);
						System.out.println("DA="+f);
						g=a+e+f;
						System.out.println("Gross pay="+g);
					}
					else
						{
							 if(a>20000)
			                             {
								i=(a*30/100);
								System.out.println("HRA="+i);
								j=(a*95/100);
			      					System.out.println("DA="+j);
			    					k=a+i+j;
								System.out.println("Gross pay="+g);
						}
							else
								{
									System.out.println("Invalid");
								}
			}
					}
}
catch (Exception e)
			{ System.out.println(e);
			}
}
}

											

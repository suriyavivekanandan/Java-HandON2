import java.io.*;

class Emploeeedata
{
		public static void main(String arg[])
		{
			try
			{
				DataInputStream i= new DataInputStream(System.in);
				String name,age,degeree,domain,experince,course,skills,programming,class,college;
				System.out.println("Enter the name of the Emplyee");
				name=(i.readLine());
				System.out.println("Enter the age of the member");
				age=(i.readLine());
				System.out.println("Enter the degreee of the member");
				degeree=(i.readLine());
				System.out.println("Enter the Experince of the memeber");
				experince=(i.readLine());
				System.out.println("Enter the domain of the member");
				domain=(i.readLine());
				System.out.println("Enter the course the member");
				course=(i.readLine());
				System.out.println("enter the skills of the member");
				skills=(i.readLine());
				System.out.println("enter the programming ide known to the member");
				programming=(i.readLine());
			       System.out.println("eneter the native of the memeber");
			       class=(i.readLine());
			      System.out.println("eneter the college of the member");
			     college=(i.readLine());
			System.out.println("The name of the member is:"+ name);
			System.out.println("The  of the Age member is:"+ age);
			System.out.println("The deomainof the member is:"+ domain);
			System.out.println("The experince of the member is:"+ experince);
			System.out.println("The courseof the member is:"+ course);
                       System.out.println("The skills of the member is:"+ skills);
		      System.out.println("The programming of the member is:"+ programming);
	              System.out.println("The native of the member is:"+ class);
                     System.out.println("The college of the member is:"+ college);
            }
               catch(Exception e)
                 {
                          System.out.println(e);
                     }
              }
}
		
			
				
				
				
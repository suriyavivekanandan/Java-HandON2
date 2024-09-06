import java.io.*;
class Biodata
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream  j=new DataInputStream(System.in);
			String name,age,dob,bloodgroup,school,college,degeree,address,sec,mothername,fathername;
			System.out.println("Enter name");
			name=(j.readLine());
		
			System.out.println("Enter age");
			age=(j.readLine());
		     
			System.out.println("enter dob");
			dob=(j.readLine());
			
			System.out.println("enter bloodgroup");
			bloodgroup=(j.readLine());
			
		       System.out.println("enter school name");
			school=(j.readLine());
			
			System.out.println("eneter college name");
			college=(j.readLine());
			
			System.out.println("Enter the degeree of the student");
			degeree=(j.readLine());
			
			System.out.println("Enter the Adresss of the student");
			address=(j.readLine());
			
			System.out.println("enter the class of the student");
			sec=(j.readLine());
			
			System.out.println("eneter the Mother name of the student");
			mothername=(j.readLine());
			
			System.out.println("eneter the Mother name of the student");
			fathername=(j.readLine());
			System.out.println("  Father name is "+fathername);
			System.out.println("Name of the student"+name);
			 System.out.println("age of the student"+age);
			System.out.println("Dob of the student is"+dob);
			System.out.println("BLOOD GROUP OF THE STUDENT"+bloodgroup);
			System.out.println("Name of the school"+school);
			System.out.println("college name is"+college);
			System.out.println("The degeree name is"+degeree);
			System.out.println("The address of the student"+address);
			System.out.println("the class of the Student is"+sec);
			System.out.println(" mother name is "+mothername);
			System.out.println("  Father name is "+fathername);

			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
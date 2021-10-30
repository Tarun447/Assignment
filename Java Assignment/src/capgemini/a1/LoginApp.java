package capgemini.a1;

import java.util.Scanner;

public class LoginApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	   System.out.println("===============Login App ===============");
	   System.out.println("Enter UserName : ");
	   String user = s.nextLine();
	   System.out.println("Enter Password : ");
	   String pass = s.nextLine();
	   int count = 1;
	   while(true)
	   {
		   
		   if((user.equalsIgnoreCase("Capgemini")&& pass.equalsIgnoreCase("111111"))||(user.equalsIgnoreCase("Tarun")&&pass.equalsIgnoreCase("222222")))
		   {
			   System.out.println("Welcome Mr. "+user);
			   break;
		   }
		   else
		   {
			   System.out.println("Re-enter Login id and pass");
			   System.out.println("Enter UserName : ");
			   user = s.nextLine();
			   System.out.println("Enter Password : ");
			   pass = s.nextLine();
			   count ++;
		   }
		   if(count==3)
		   {
			   System.out.println ("You have cross 3 attempt ");
			   System.out.println("Contact Your admin...Thank You");
			   break;
		   }
	   }

	}

}

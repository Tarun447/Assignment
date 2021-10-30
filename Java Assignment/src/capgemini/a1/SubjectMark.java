package capgemini.a1;

import java.util.Scanner;

public class SubjectMark {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	System.out.println("Enter Subject1 mark: ");
	int s1 = s.nextInt();
	System.out.println("Enter Subject2 mark: ");
	int s2 = s.nextInt();
	System.out.println("Enter Subject3 mark: ");
	int s3 = s.nextInt();
	
	if(s1>=60 && s2>=60 && s3>=60)
	{
	System.out.println("Passed");	
	}
	if((s1>=60 && s2>=60&&s3<60)||(s1>=60 && s2<60&&s3>=60)||(s1<60 && s2>=60&&s3>=60))
	{
		System.out.println("Promoted");
	}
	if((s1>=60 && s2<60&&s3<60)||(s1<60 && s2<60&&s3>=60)||(s1<60 && s2>=60&&s3<60)||(s1<60 && s2<60&&s3<60))
	{
		System.out.println("Failed");
	}
	}
}

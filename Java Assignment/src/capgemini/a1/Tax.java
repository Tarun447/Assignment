package capgemini.a1;

import java.util.Scanner;

public class Tax {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("=====================Tax Checker=====================");
	System.out.println("Enter Your Amont : ");
	double sal = s.nextDouble();
	if(sal >=0&&sal <=180000)
	{
		System.out.println("You don't have to pay any tax");
	}
	else if(sal >=180001 &&sal <=300000)
	{
		System.out.println("You have to pay "+(sal*0.1));
	}
	else if(sal >=300001&& sal <=500000)
	{
		System.out.println("You have to pay "+(sal*0.2));
	}
	else if(sal >=500001&& sal <=1000000)
	{
		System.out.println("You have to pay "+(sal*0.3));
	}
	else
	{
		System.err.println("please Enter Valid Salary");
	}
}
}

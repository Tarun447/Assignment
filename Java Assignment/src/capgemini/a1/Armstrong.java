package capgemini.a1;

import java.util.Scanner;
import java.lang.Math;
public class Armstrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the number : ");
		int n = s.nextInt();
		System.out.println("Enter the "+n+" lenght of number : ");
		int num = s.nextInt();
		int number = num;
		double total=0,rem;
		while(number!=0)
		{
			rem = number%10;
			total = total+ (Math.pow(rem, n));
			number = number/10;
		}
      if(total==num)
      {
    	  System.out.println(num +" is a Armstrong Number");
      }
      else
      {
    	  System.out.println(num +" is not a Armstrong Number");
      }
	}

}

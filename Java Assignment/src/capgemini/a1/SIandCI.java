package capgemini.a1;

import java.util.Scanner;

public class SIandCI {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Principle Amount : ");
	float  p = s.nextLong();
	System.out.println("Enter time : ");
	float t = s.nextInt();
	System.out.println("Enter Rate of  Interest: ");
	float r  = s.nextInt();
	
   double  si = (p*t*r)/100;
   System.out.println("Simple Interest : "+si);
   double ci = (p*Math.pow(1+(r/1200),12*t))-p;
   System.out.println("Compound Interest : "+ci);
}
}

package capgemini.a4;

import java.util.Scanner;

public class Exception1 {
public static void main(String[] args) {
	try(Scanner s = new Scanner(System.in))
	{
		try
		{
			System.out.println("Enter first number : ");
			int a = s.nextInt();
			System.out.println("Enter Second Number : ");
			int b = s.nextInt();
			System.out.println("Division : "+(a/b));
		}
		catch(ArithmeticException ae )
		{
			System.err.println("Invalid attempt to devide  a number by zero");
		}
	}
}
}

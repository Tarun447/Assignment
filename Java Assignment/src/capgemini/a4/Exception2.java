package capgemini.a4;

import java.util.Scanner;

class UnsupportedOperationException extends Exception
{
	public UnsupportedOperationException()
	{}
	public UnsupportedOperationException(String s)
	{
		super(s);
	}
	public void devide()
	{
		try(Scanner s = new Scanner(System.in))
		{
			try
			{
				System.out.println("Enter first number : ");
				int a = s.nextInt();
				System.out.println("Enter Second Number : ");
				int b = s.nextInt();
				if(b==0)
				{
					UnsupportedOperationException obj = new UnsupportedOperationException("Input can't be zero");
					throw obj;
				}
				System.out.println("Division : "+(a/b));
			}
			catch( UnsupportedOperationException ae  )
			{
				ae.printStackTrace();
			}
	}

	}
}
public class Exception2 {
public static void main(String[] args) {
	UnsupportedOperationException obj = new UnsupportedOperationException();
	obj.devide();
}
}

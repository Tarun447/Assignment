package capgemini.a7;

import java.util.function.Predicate;

public class Lambda5 {
	public static void main(String[] args)
	{
		// Creating predicate
		Predicate<Integer> lesserthan = i -> (i < 18);

		// Calling Predicate method
		System.out.println(lesserthan.test(10));
	}
}

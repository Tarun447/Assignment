package capgemini.a7;

import java.util.function.IntConsumer;

public class Lambda3 {
	public static void main(String args[])
    {
            // Create a IntConsumer Instance
            IntConsumer display = a -> System.out.println(a * 10);

            // Using accept() method
           display.accept(3);
           display.accept(4); //using some built in func to invoke consumer interface
           display.accept(5);
        System.out.println(display.equals(30));
        }


}

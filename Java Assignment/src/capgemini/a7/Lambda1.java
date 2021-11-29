package capgemini.a7;

@FunctionalInterface
interface ArithematicOperations
{
    void display(int a, int b);
}
public class Lambda1 {

	public static void main(String[] args) {
        ArithematicOperations a1=(a,b)->{
            System.out.println("addition is: "+(a+b));
            System.out.println("subtraction is: "+(a-b));
            System.out.println("multiplication is:"+(a*b));
            System.out.println("division is :" +(a/b));
        };
            a1.display(10, 15);
        System.out.println(" ");
        a1.display(20,30);


    }

}

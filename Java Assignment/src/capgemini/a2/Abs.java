package capgemini.a2;
abstract class Test
{
	abstract public void add(int x,int y);
	public void sub(int x,int y)
	{
		System.out.println("Subtractiion : "+(x-y));
	}
}
public class Abs extends Test {
	public void add(int x,int  y)
	{
		System.out.println("Addition : "+(x+y));
	}

	public static void main(String[] args) {
	Abs a = new Abs();
	a.add(12, 13);
	a.sub(5, 2);

	}

}

package capgemini.a2;

import java.util.Scanner;

abstract class Shape
{
	abstract public void draw();
}
class Line extends Shape
{
	Scanner s = new Scanner(System.in);
	
	public void draw()
	{
	System.out.println("Enter length of a line");
	int l = s.nextInt();
	System.out.println("Length of the line : "+l);
	}
}

class Rectangle extends Shape
{
	Scanner s = new Scanner(System.in);
	public void draw()
	{
		System.out.println("Enter length of a rectangle");
		int l = s.nextInt();
		System.out.println("Enter breadth of a line");
		int b = s.nextInt();
		System.out.println("Perimeter of rectangle : "+(2*(l+b)));
	}
}

class Triangle extends Shape
{
	Scanner s = new Scanner(System.in);
	public void draw()
	{
		System.out.println("Enter length  a side");
		int a = s.nextInt();
		System.out.println("Enter length of b side ");
		int b = s.nextInt();
		System.out.println("Enter length of c side ");
		int c = s.nextInt();
		System.out.println("Triangle Perimeter : "+(a+b+c));
	}
}
public class Inheritance {
public static void main(String[] args) {
	Line l = new Line();
	l.draw();
	
	Rectangle rt = new Rectangle();
	rt.draw();
	
	Triangle tr = new Triangle();
	tr.draw();
}
}

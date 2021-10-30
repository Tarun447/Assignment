package capgemini.a2;

import java.util.Scanner;

class Employee
{
	
	public void calculateTotal(int x)
	{
		
		System.out.println("Your Total Salary : "+x);
	}
}

class Manager extends Employee
{
	public void calculateTotal(int x)
	{
		int baseSal = 50000;
		int incetive = 500*x;
		System.out.println("Total Salary of MAnager : "+(baseSal+incetive));		
	}
}
class Labour extends Employee
{
	public void calculateTotal(int x)
	{
		int basesal = 15000;
		int overtime = 200*x;
		System.out.println("Total Salary of Labour : "+(basesal+overtime));
	}
}



public class EmployeeAndLabour {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("--------Choice--------");
	System.out.println("1.Manager\n2.Labour");
	int ch = s.nextInt();
	switch(ch)
	{
	case 1:
		Manager m = new Manager();
		System.out.println("Enter number of over Duty: ");
		int ovr = s.nextInt();
		m.calculateTotal(ovr);
        break;
	case 2:
		Labour lb = new Labour();
		System.out.println("Enter number of over Time: ");
		int ovt= s.nextInt();
		lb.calculateTotal(ovt);
	}
	
}
}

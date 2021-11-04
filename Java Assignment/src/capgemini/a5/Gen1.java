package capgemini.a5;

import java.util.HashSet;

class Employee
{
	int id;
	String dpart,name;
	double  salary;
	public Employee(int id, String name, String dpart,double salary)
	
	{
		this.id= id;
		this.name = name;
		this.dpart = dpart;
		this.salary = salary;
		
	}
	public void displayDetails()
	{
		System.out.println("Employee id:"+id+"\nEmployee Name : "+name+"\nEmplyee Department : "+dpart+"\nEmployee Salary : "+salary);
	}
}
public class Gen1 {
public static void main(String[] args) {
	HashSet <Employee>  hs = new HashSet<>();
	hs.add(new Employee(1, "Tarun", "Analyst",31000));
	hs.add(new Employee(3, "Vineet", "Analyst",31000));
	hs.add(new Employee(2, "Ashu", "Analyst",31000));
	hs.add(new Employee(6, "Nilesh", "Software Engineer",31000));
	hs.add(new Employee(4, "Aryan", "Software Engineer",30000));
	hs.add(new Employee(5, "Anshul", "Analyst",21000));
	hs.add(new Employee(9, "Ramu", "Tester",20000));
	
	for(Employee e : hs)
	{
		System.out.println("---------------------------------------------------");
		e.displayDetails();
		System.out.println("---------------------------------------------------");
	}
	
}

}

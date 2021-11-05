package capgemini.a6;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;



class Employee implements Comparable<Employee>
{
	private int id;
	private String name,dpart;
	private double sal;
	
	Employee(int id,String name,String dpart,double sal)
	{
		this.id= id;
		this.name=name;
		this.dpart=dpart;
		this.sal= sal;
	}
		public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDpart() {
		return dpart;
	}
	public double getSal() {
		return sal;
	}	
//	public String toString()
//	{
//		return "Id : "+id+" Name : "+name+" Department : "+dpart+" Salary : "+sal;
//	}
	
//	public int compareTo(Employee e) {
//		return this.getId()-e.getId();
//	}
}

//sort by id
class IdCompare implements Comparator<Employee>
{
	public int compare(Employee e,Employee e1)
	{
		if(e.getId()>e1.getId()) return 1;
		else if(e.getId()<e1.getId()) return -1;
		return 0;
	}
}

// comapare by name
class NameCompare implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return e1.getName().compareTo(e2.getName());
	}
}

//compare by the department name
class DepartCompare implements Comparator<Employee>
{
	public int compare(Employee e,Employee e1)
	{
		return e.getDpart() .compareTo(e1.getDpart() );
	}
}

//compare by salary
class SalaryCompare implements Comparator<Employee>
{
	public int compare(Employee e,Employee e1)
	{
		if(e.getSal() < e1.getSal())return -1;
		else if(e.getSal()>e1.getSal()) return 1;
		return 0;
	}
}



public class Col3 {
 public static void main(String[] args) {
	System.out.println("----------------Enter Choice--------------");
	System.out.println("a. ID\nb. Name\nc. Department\nd. Salary");
	Scanner s = new Scanner(System.in);
	String c = s.nextLine();
	switch(c)
	{
		case "a":
			TreeSet<Employee> t  = new TreeSet<Employee>(new IdCompare());
			t.add(new Employee(1, "Tarun", "Analyst",31000));
			t.add(new Employee(12, "Vineet", "DevOps",32000));
			t.add(new Employee(22, "Ashu", "Consultant",33000));
			t.add(new Employee(16, "Nilesh", "Software Engineer",22000));
			t.add(new Employee(45, "Aryan", "Cloud Devloper",29000));
			t.add(new Employee(91, "Anshul", "Senior Analyst",21000));
			t.add(new Employee(87, "Ramu", "Tester",20000));
		  for(Employee e:t )
		  {
			  System.out.println("Id : "+e.getId()+" Name : "+e.getName()+" Department : "+e.getDpart()+" Salary : "+e.getSal());
		  }
			
			break;
		case "b":
			TreeSet<Employee> t1  = new TreeSet<Employee>(new NameCompare());
			t1.add(new Employee(1, "Tarun", "Analyst",31000));
			t1.add(new Employee(12, "Vineet", "DevOps",32000));
			t1.add(new Employee(22, "Ashu", "Consultant",33000));
			t1.add(new Employee(16, "Nilesh", "Software Engineer",22000));
			t1.add(new Employee(45, "Aryan", "Cloud Devloper",29000));
			t1.add(new Employee(91, "Anshul", "Senior Analyst",21000));
			t1.add(new Employee(87, "Ramu", "Tester",20000));		  for(Employee e:t1 )
		  {
			  System.out.println("Id : "+e.getId()+" Name : "+e.getName()+" Department : "+e.getDpart()+" Salary : "+e.getSal());
		  }
			break;
		case "c":
			TreeSet<Employee> t2  = new TreeSet<Employee>(new DepartCompare());
			t2.add(new Employee(1, "Tarun", "Analyst",31000));
			t2.add(new Employee(12, "Vineet", "DevOps",32000));
			t2.add(new Employee(22, "Ashu", "Consultant",33000));
			t2.add(new Employee(16, "Nilesh", "Software Engineer",22000));
			t2.add(new Employee(45, "Aryan", "Cloud Devloper",29000));
			t2.add(new Employee(91, "Anshul", "Senior Analyst",21000));
			t2.add(new Employee(87, "Ramu", "Tester",20000));
		  for(Employee e:t2 )
		  {
			  System.out.println("Id : "+e.getId()+" Name : "+e.getName()+" Department : "+e.getDpart()+" Salary : "+e.getSal());
		  }
			break;
		case "d":
			TreeSet<Employee> t3 = new TreeSet<Employee>(new SalaryCompare());
			t3.add(new Employee(1, "Tarun", "Analyst",31000));
			t3.add(new Employee(12, "Vineet", "DevOps",32000));
			t3.add(new Employee(22, "Ashu", "Consultant",33000));
			t3.add(new Employee(16, "Nilesh", "Software Engineer",22000));
			t3.add(new Employee(45, "Aryan", "Cloud Devloper",29000));
			t3.add(new Employee(91, "Anshul", "Senior Analyst",21000));
			t3.add(new Employee(87, "Ramu", "Tester",20000));
		  for(Employee e:t3 )
		  {
			  System.out.println("Id : "+e.getId()+" Name : "+e.getName()+" Department : "+e.getDpart()+" Salary : "+e.getSal());
		  }
			break;
			default:
				System.err.println("Invalid Choice......Enter Valid One");
			break;
	}
}
}

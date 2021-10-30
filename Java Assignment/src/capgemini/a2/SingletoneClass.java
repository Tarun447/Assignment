package capgemini.a2;

class Employees
{
	private static Employees em = null;
	private Employees()
	{
		System.out.println("Welcome");
	}
	public static Employees getEmpInstance()
	{
		em = new Employees();
		return em;
	}
	public void getDesignation(String des)
	{
		   System.out.println("Your designation is : "+des);
	}
}
public class SingletoneClass {

	public static void main(String[] args) {
		Employees manag  = Employees.getEmpInstance();
		manag.getDesignation("Manager");
		
		
		// Object for labour 
		Employees lab = Employees.getEmpInstance();
		lab.getDesignation("Labour");
		
	}

}

package capgemini.a6;

import java.util.Map;
import java.util.TreeMap;

enum Gender
{
	MALE,FEMALE;
}

class Contact
{
	
	String name,email;
	long Ph;
	public Gender ge;
	
  
	public Contact(long ph,String name,String email,Gender ge)
	{
		this.Ph = ph;
		this.name = name;
		this.email = email;
		this.ge = ge;
		
	}
	public void display()
	{
		System.out.println("Phone Number  : "+Ph);
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		System.out.println("Gender : "+ge);
	}
}
public class Col1 {

	public static void main(String[] args) {
		TreeMap <Long,Contact>t = new TreeMap<>();
		t.put(7978306759l, new Contact(7978306759l,"Tarun","xyz@gmail.com",Gender.MALE));
		t.put(8765757667l, new Contact(8765757667l,"vineet","vty@gmail.com",Gender.MALE));
		t.put(7978306899l, new Contact(7978306899l,"Ramya","ramya@gmail.com",Gender.FEMALE));
		t.put(8599881176l, new Contact(8599881176l,"Lucy","lucy@gmail.com",Gender.FEMALE));
		t.put(7978306897l, new Contact(7978306897l,"Aryan","aryan@gmail.com",Gender.MALE));
		
		System.out.println(t);
		
		System.out.println("Keys : "+t.keySet());
		
		System.out.println("Values : "+t.values());
		
//		Contact c = null;
		for(Map.Entry<Long,Contact> entry : t.entrySet()) {
			System.out.println("--------------------------------------------");
			  Long key = entry.getKey();
			  Contact c = entry.getValue();
			  c.display();
			  
			}
		
		

	}

}

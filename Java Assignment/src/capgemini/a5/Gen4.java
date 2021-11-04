package capgemini.a5;

import java.util.HashMap;

class Pair<k,v>
{
//	HashMap<k,v> hs = new HashMap<>();	
	k t;
	v a;
	public void setKey(k t)
	{
		this.t = t;
	}
	public void setValue(v a)
	{
		this.a = a;
	}
	public void display()
	{
		System.out.println(t+"="+a);
	}
}

public class Gen4 
{
public static void main(String[] args) {
	Pair <String,String> myObj = new Pair<>();
	myObj.setKey("1");
	myObj.setValue("Hello");
	myObj.display();
	
	
	Pair <String,java.util.Date> myObj1 = new Pair<>();
	myObj1.setKey("Today is : ");
	myObj1.setValue(new java.util.Date());
	myObj1.display();
}
}

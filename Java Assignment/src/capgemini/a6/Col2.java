package capgemini.a6;

import java.util.HashSet;

class Product
{
	String name;
	double price;
	int bcode;
	public Product(String name,double price,int bcode)
	{
		this.name=name;
		this.price=price;
		this.bcode=bcode;
	}
	public void pdtDisplay()
	{
		System.out.println("Product Name : "+name);
		System.out.println("Product Code : "+bcode);
		System.out.println("Product Price : "+price);
	}
}



public class Col2 {
public static void main(String[] args) {
	HashSet <Product>t = new HashSet<>();
	t.add(new Product("Java Book",378.90,897679));
	t.add(new Product("T-shirt",499,3345));
	t.add(new Product("Jeans",15000.00,8987));
	t.add(new Product("Bat",2000,89968));
	t.add(new Product("Ball",60,453));
	
	System.out.println(t);
	
	for(Product p :t)
	{
		System.out.println("---------------------------------------------");
		p.pdtDisplay();
	}
			
}
}

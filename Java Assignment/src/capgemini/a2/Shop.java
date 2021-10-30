package capgemini.a2;

import java.util.ArrayList;
import java.util.Scanner;

abstract class DesertItem
{
	
	abstract public int getCost();
}

class Candy extends DesertItem
{
	static int can = 1;
	public void addItem(int a )
	{
		can = can+a;
	}
	public int getCost()
	{
		return 60 ;
	}
}

class IceCream extends DesertItem
{
	static int can = 1;
	public void addItem(int a )
	{
		can = can+a;
	}
	public int getCost()
	{
		return 50 ;
	}
}

class Cookies extends DesertItem
{
	static int can = 1;
	public void addItem(int a )
	{
		can = can+a;
	}
	public int getCost()
	{
		return 70 ;
	}
}


public class Shop {
public static void main(String[] args) {
	
}
}

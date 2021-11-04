package capgemini.a5;

import java.util.ArrayList;

public class Gen3 {
public static  <T> void swap (T[] ele,int i,int j)
{
	T a = ele[i];
	ele[i] = ele[j];
	ele[j] = a;
	
	for(T k:ele)
	{
		System.out.print(k+" ");
	}
}
	public static void main(String[] args) {
	Integer a[] = {1,2,3,4,6};
	System.out.println("Before Swap");
	for(Integer i :a)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("After Swap");
	Gen3.swap(a, 2, 3);

	}

}

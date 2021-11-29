package capgemini.a7;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda6 {
	public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("Tarun","Rakesh","Rajesh","Kuku","Sunil"));
        for (int i = 0; i <=numbers.size()-1; i++) {
            int a = numbers.get(i).length();
            if (a % 2 !=0) {
                numbers.remove(i);
                //removing the words which have odd lengths//
            }
        }
        System.out.println(numbers); //printing only words which have even lengths//
    }
}

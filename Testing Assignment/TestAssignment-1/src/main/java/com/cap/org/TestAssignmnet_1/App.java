package com.cap.org.TestAssignmnet_1;

import java.util.Arrays;


public class App 
{
	public int[] arr(int [] numbers) {
		Arrays.sort(numbers);
		
		int [] arr1= {numbers[0],numbers[numbers.length-1]};
		
		return arr1;
}
}
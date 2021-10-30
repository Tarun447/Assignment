package capgemini.a1;

public class BubbelSort {
public static void main(String[] args) {
	int arr [] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	int len = arr.length;
	for(int i = 0;i<len-1;i++)
	{
		for(int j =0;j<len-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	
	System.out.println("After Sort ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}

package capgemini.a1;

public class ArmstrongRange {
public static void main(String[] args) {
	for(int i = 100;i<=999;i++)
	{
		int num = i;
		int  total= 0;
		while(num!=0)
		{
			int  rem = num%10;
			total = total+(rem*rem*rem);
			num = num/10;
		}
		if(total == i)
		{
			System.out.print(total+"\t");
		}
	}
}
}

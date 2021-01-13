package java_programs;
import java.util.*;

public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		int num =scan.nextInt();
		System.out.println(num);
		int temp=num;
		int sum=0;
		int r;
		
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}

}

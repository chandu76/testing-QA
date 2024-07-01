package IDEALABS;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter any number if you wnat to reverse a number");
		long number=sc.nextLong();
		long rev=0;
		while(number!=0)
		{
			long reminder=number%10;
			rev=rev*10+reminder;
			number=number/10;
		}
		System.out.println("reverse of a number is :"+rev);
	}
}

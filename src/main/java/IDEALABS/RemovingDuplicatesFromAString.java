package IDEALABS;

import java.util.LinkedHashSet;

public class RemovingDuplicatesFromAString {
	public static void main(String args[])
	{

		String str="chandu";
		String temp=str;
		String  rev="";
		int len=str.length();
		for (int i=len-1;i>=0;i--)
		{
			 rev=rev+str.charAt(i);
		}
		System.out.println("reverse of the string:"+rev);
		if (temp.equals(rev))
		{
			System.out.println("given string is a palindrome string");
		}
		else
		{
			System.out.println("given string is not a palindrome string");
		}
	}
}
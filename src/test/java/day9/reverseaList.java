package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class reverseaList {
	public static boolean palindrome()
	{
		String name = "madam";
		String reversed = "";
		for(int i =name.length()-1; i>=0 ;i--)
		{
			reversed += name.charAt(i);
		}
		System.out.println(reversed);
		if(name.equals(reversed))
			return true;
					
		return false;
	}
	
	public static int fact(int n)
	{
		int fact = 1;
		int sum=0;
		for(int i =1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
		return fact;
		
	}
	public static void main(String[] args) {
		System.out.println(palindrome());
		System.out.println(fact(5));
		
	}
	

}

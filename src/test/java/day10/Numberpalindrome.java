package day10;

public class Numberpalindrome {
	public static void main(String[] args)
	
	{
		int  n = 12345;
		int newn=0;
		while(n>0)
		{
			int temp = n%10; //5
			newn = newn*10 + temp; //0*10+5 = 5 //5*10+4 = 54
			n/=10;
			
		}
		System.out.println(newn);
		
	}

}

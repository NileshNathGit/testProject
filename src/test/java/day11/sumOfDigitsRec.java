package day11;

public class sumOfDigitsRec {
	public static void sum(int n, int s)
	{
		
		if(n==0)
		{
			System.out.print(s);
			return;
		}
			sum(n/10,s=s+(n%10)); 
	}
	public static void main(String[] args) {
		int n = 122;
		int sum=0;
		sum(n,sum);
		
	}

}

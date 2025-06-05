package day10;

public class factorialRecursion {
	public static int rec(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n*rec(n-1); 

	}
	public static void main(String[] args) 
	{
		System.out.println(rec(5));
	}

}

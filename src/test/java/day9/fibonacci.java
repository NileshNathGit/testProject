package day9;

public class fibonacci {
public static boolean isprime(int num)
{
	if(num <=1)
	{
		return false;
	}
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			return false;
		}
	}
	
	return true;
}
public static void main(String[] args) {
	

		int n = 10;
		int start = 0; int end = 1;
		System.out.print(start+" "+ end+" ");
		for(int i =2;i<=n;i++)
		{
			int next = start + end;
			System.out.print(next+" ");
			start = end;
			end =next;
		}
		
		System.out.println(isprime(4));

	}

}

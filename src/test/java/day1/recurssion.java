package day1;

public class recurssion {
	
	static String reverse(String str)
	{
		if(str.length()<=1) return str;
		return reverse(str.substring(1))+str.charAt(0);
	}
	
	
	static void fib(int start, int end,int count)
	{
		if(count ==0)
		return;
		int next = start + end;
	
		fib(end , next , count -1);
		System.out.print(" "+next);
	}
	
	static void patterns(int row , int col)
	{
		//base case
		if(row==0)
			return;
		if(col<row)
		{
			
			patterns(row,col+1);
			System.out.print("*");
		}
		else
		{
			
			patterns(row-1,0);
			System.out.println();
		}
	}
	
	static int sumofDigits(int num)
	{
		
		if(num==0)
		 return 1;
		return (num%10) * sumofDigits(num/10); 	
		
	}
	public static void main(String[] args) 
	
	{
		String str = "nilesh";
		System.out.println(reverse(str));
		patterns(5,0);
		System.out.println("\n");
		System.out.println(sumofDigits(125));
	}

	
}

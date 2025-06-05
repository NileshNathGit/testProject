package day11;

public class oneToNrec {
	
	public static void  printN(int n , int end) //2 12
	{
		System.out.print(n+" ");
		if(n==end) 
		{
			return;
		}
		 printN(n+1,end); 
	}
	public static void main(String[] args) {
		
					printN(1,12);

	}

}

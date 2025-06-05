package day11;

public class recursionFibbonacci {
	
	public static int  fibb(int first, int last,int n)
	{
		
		
		System.out.print(first+" "); //0 1 
		if(first>=n)
			return 1;
		 return fibb(last,first+last,n); 
		
		
		
	}
	public static void main(String[] args) {
	
		System.out.println(fibb(0,1,20));
		
	}

}

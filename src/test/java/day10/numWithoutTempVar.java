package day10;

public class numWithoutTempVar{
	
	//Swap Two Numbers Without Using Temp Variable
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 10;
		System.out.println(a+"---"+b);
		a = a+b; // 5+10 = 15
		b = a-b; // 15-10 = 5
		a=a-b; //15-5 = 10 
		System.out.println(a+"---"+b);
		
		
				

	}

}

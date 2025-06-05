package day11;

public class recursionStringRev {
	public static void reverse(String str,int len,String rev) 
	{

		if(rev.length()==str.length()) 
		{
			System.out.print(rev);
			return;
		}
		
		reverse(str,len-1,rev+str.charAt(len)); 
		
	
	}
	public static String reverse(String str) //ilesh lesh esh sh h
	{
		
		if(str.isEmpty())
		{
			return "";
		}
		return reverse(str.substring(1)) + str.charAt(0); //ilesh + n || lesh  + i || esh + l || sh + e ||  h + s || "" + h
	}
		
		
	
	public static void main(String[] args) {
		String org= "nilesh";
		String rev="";
		reverse(org,org.length()-1,rev);
		System.out.println();
		System.out.println(reverse(org));
		
		
	}

}

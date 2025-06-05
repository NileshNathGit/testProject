package day11;

public class palindrome {
	public static boolean palin(String str, int start,int end)
	{
		if(start>=end)
		{
			return true;
		}
		if(str.charAt(start)!=str.charAt(end))
		{
			return false;
		}
		return palin(str,start+1,end-1);
	}
	public static void main(String[] args) {
		
		String str = "shank";
		System.out.println(palin(str,0,str.length()-1));
		
	}

}

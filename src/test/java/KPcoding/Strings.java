package KPcoding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Strings {

	public static void main(String[] args) {
		String str = new String("xyz abc");
		String s = "xyzxyz";
		//		str = str + s ;
		System.out.println(str==s);
		System.out.println(str.equals(s));
		System.out.println(str.charAt(0));

		StringBuffer sb = new StringBuffer(str);
		System.out.println("Original "+ str);
		System.out.println("Reversed "+ sb.reverse());  
		//Original xyz abc
		//	Reversed cba zyx
		
//		Expected  abc xyz
		String [] st = str.trim().split("");
		
		List<String> list = new ArrayList<>(Arrays.asList(st));
//		List<String> list2 = new ArrayList<>(list.reversed());
		
		for(int i = list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i));
		}
		
		
		 
 
	}
}

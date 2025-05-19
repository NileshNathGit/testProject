package KPcoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverselist {
	
	public static void main(String[] args) {
		String str = "nilesh is good";
		
		String arr[] = str.split(" ");
		
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		for(int i = list.size()-1; i>=0;i--)
		{
			System.out.println(list.get(i));
		}
		for(String l : list) {
			System.out.print(l);
		}
		
	}

}

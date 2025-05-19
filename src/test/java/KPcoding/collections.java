package KPcoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collections 

{
	public static void main(String[] args) 
{
//		Remove Duplicates from a List

	List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
	Set<Integer> newList = new HashSet<>(list);
	System.out.println(newList);
	//	Frequency Count of Characters in a String
	String str = "aabcccdee";
	Map<Character,Integer> map = new HashMap<>();
	for(char c : str.toCharArray())
	{
		map.put(c, map.getOrDefault(c, 0)+1);
	}
	for(Map.Entry<Character, Integer> entry : map.entrySet())
	{
//		if(entry.getValue()>1)
//		{
//			System.out.println(entry.getKey()+" --> "+entry.getValue());
//		}
		System.out.println(entry.getKey()+" --> "+entry.getValue());
	}
	
	
	
}

	
	

}

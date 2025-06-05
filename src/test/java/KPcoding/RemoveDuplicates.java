package KPcoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates 
{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,4,3,2,8));
		
//		Set<Integer> listWithoutDupes  = new TreeSet<>();
		Set<Integer> listWithoutDupes  = new TreeSet<>();
		
		ArrayList <Integer> dupes = new ArrayList<>();
		for(int n : list)
		{
			if(!(listWithoutDupes.add(n)))
			{
				dupes.add(n);
			}
		}
		System.out.println(dupes);
		System.out.println(listWithoutDupes);
		
	
		
	}
}

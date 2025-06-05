package KPcoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class compareLists {

//	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,45,3,67));
		ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(1,45,3,2,3,67));
		Set<Integer> list3 = new HashSet<>();
		System.out.println(new HashSet<>(list1).equals(new TreeSet<>(list2)));
	}
}

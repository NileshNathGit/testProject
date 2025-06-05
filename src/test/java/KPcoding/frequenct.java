package KPcoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class frequenct {
public static void main(String[] args) {
	
	List<Integer> nums = Arrays.asList(1, 2,4,3,5,5, 2, 3, 1, 4,7);
	Map<Integer, Integer> freq = new HashMap<>();
	for (int num : nums) {
	    freq.put(num, freq.getOrDefault(num, 0)+1 );
	}
	 for(Map.Entry<Integer,Integer> entry : freq.entrySet())
	 {
		 if(!(entry.getValue()>1))
		 {
			 System.out.println(entry.getKey()+" ---> "+entry.getValue() );
		 }
	 }
}

}

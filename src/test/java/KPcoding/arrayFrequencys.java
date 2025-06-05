package KPcoding;

import java.util.Arrays;
import java.util.List;

public class arrayFrequencys {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 2, 3, 1, 4);
		int arr[] = new int[10];
		
		
		for(int num : nums)
		{
			arr[num]++;
		}
		
		for(int i=0; i<arr.length;i++)
		{
			if( arr[i]>0)
			{
				System.out.println(i+" --> "+arr[i]);
			}
		}
	
		
	}

}

package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class test 
{
	public static void main(String[] args) 
	{

		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(33,38,46,24,26,6,42,28));
		int k =2;
		ArrayList<Integer> res = new ArrayList<>();
		if (k == 1) 
		{
			for(int i : arr)
				res.add(i);
		}  
		else {
			int b=0;
			int j=k-1;
			int max=0;
			while(j<arr.size()) 
			{
				for(int i=b;i<=j;i++)
				{
					if(arr.get(i)>=max)
						max=arr.get(i);
				}
				res.add(max);
				b++;j++;
			}
		}
		System.out.println(res);
	}




}

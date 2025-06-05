package KPcoding;

import java.util.Arrays;

public class twoSums {
	
	
	public static int[] twoSum(int[] nums, int target) 
    {
        int indices[] = new int[2];
        for(int i = 0; i<nums.length;i++)
        {
            for(int j =1;j<nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    indices[0]=i;
                    indices[1]=j;
                }
            }
        }
        return indices;
    }

	
	public static void main(String[] args) {
		int arr[] = {3,4,8};
		int ta = 11;
		System.out.println(Arrays.toString(twoSum(arr,ta)));
		
	}

}

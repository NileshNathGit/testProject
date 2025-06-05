package KPcoding;

public class bubbleSort {
	 public static void main(String[] args) {
	        //BubbleSort
	        int arr[] = {1,2,12,34,22,1,32,11};
	        for(int i = 0; i<arr.length;i++)
	        {
	            for(int j = 0; j<arr.length-1-i;j++)
	            {
	                if(arr[j]>arr[j+1])
	                {
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	            }
	        }
	       for(int i : arr)
	       {
	           System.out.print(i+" ");
	           
	       }
	        
	    }
}

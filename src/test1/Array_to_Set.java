package test1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array_to_Set {
	
	public static void main(String[] args) {
		int []arr = {1,3,2,6,2,4,1,7};
		
		//sorting array
		int maxValue = Integer.MAX_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				
				if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }		
		}
	}
		System.out.println(Arrays.toString(arr));	
		Arrays.sort(arr);
		
		//array to set		
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		
	}

}

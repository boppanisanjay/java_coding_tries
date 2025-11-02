package test;

import java.util.Arrays;

public class Merge_sorted_arrays {
	public static void main(String[] args) {
		
	int arr1[] = {2,1,7,4,9,11,34,5};
	int arr2[] = {5,3,6,4,6,7,56,5,6};
	
	int length1 = arr1.length;
	int length2 = arr2.length;
	
	int arr3[] = new int[length1+length2] ;
	
	for (int i=0; i<arr1.length;i++) { 
		
		arr3[i] = arr1[i];
		
	}
	for(int j=0;j<arr2.length;j++) {
		arr3[j+length1] = arr2[j];
	}
	
	Arrays.sort(arr3);
	
	System.out.println(Arrays.toString(arr3));

}
}

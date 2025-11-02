package test;

import java.util.Arrays;

public class Secondlargestinarray {
	public static void main(String[] args) {
		//Find the second largest number in an array.

		int arr[] = {23,43,12,9,54,24,76,11,1};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					
					arr[j+1] = temp;
				}
				
			}
		}
		System.out.println("soretd array : "+Arrays.toString(arr));
		int length = arr.length;
		System.out.println(arr[length-2]);
	}

}

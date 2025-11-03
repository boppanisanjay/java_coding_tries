package test2;
//reverse array
//smallest and biggest in array
//count duplicates
//move all zeroes to end
//find second largest

import java.util.Arrays;

public class Array {
	static int array[]= {4,3,6,1,0,7,2,2};
	
	private static void reverse_array() {
		int arr[]=array;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
	
	private static void smallest_biggest() {
		 int arr[]=array;
		 int max=arr[0];
		 int min =arr[0];
		 for(int i=1;i<arr.length;i++) {
			 if(arr[i]>max) {
				 max=arr[i];
			 }
			 if(arr[i]<min) {
				 min=arr[i];
			 }
		 }
		 System.out.println(max);
		 System.out.println(min);

	}
	
	private static void count_duplicates() {
		int arr[]=array;
		for(int i=0;i<arr.length;i++) {
			int count =1;
			boolean dup=false;
			for(int j=0;j<i;j++) {
				if(arr[j]==arr[i]) {
					dup=true;
				}
			}
			if(dup) {
				continue;
			}
			for(int k=i+1;k<arr.length;k++) {
				if(arr[k]==arr[i]) {
					count++;
				}
			}
			System.out.println(arr[i] + " is present " + count + " times");
		}

	}
	public static void main(String[] args) {
		//reverse_array();
		//smallest_biggest();
		count_duplicates();
	}
	

}

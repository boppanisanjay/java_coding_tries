package test;

public class Largest_ele_array {

	static void try1(){

		int arr1[] = {23,45,201,76,12,43,9,89,01,106,23,45 }   ;
		int largest = arr1[0];
		for (int i=1;i<arr1.length;i++) {
			if(arr1[i]>largest) {
				largest = arr1[i];
			}

		}
		System.out.println(largest);

	}

	static void try2() {
		int arr[] = {23,45,201,76,12,43,9,89,01,106,23,45 }   ;
		int maxvalue = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxvalue) {
				maxvalue=arr[i];
			}
		}
		System.out.println("try2: "+maxvalue);
	}
	
	public static void try3() {
		int arr[] = {23,45,201,76,12,43,9,89,01,106,23,45 };
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
	}
	
	public static void try4() {
		int arr[] = {23,45,201,76,12,43,9,89,01,106,23,45 };
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		try4();
		try2();
		
	}
}

package test;

public class Missing_number_in_array {
	//Find the missing number in an array of integers from 1 to n.
	public static void main(String[] args) {
		shuffledorder();

		int arr[]= {1,2,4,5};
		int length =arr.length;

		int n = arr[length-1];
		int sum_overall = n*(n+1)/2;

		int sum =0;
		for(int num : arr) {
			sum+=num;
		}
		int number = sum_overall-sum;
		System.out.println(number);

	}

	//Given an array containing numbers from 1 to n in a shuffled order with one number missing, find the missing number.
	static void shuffledorder() {
		int[] arr = {3, 7, 1, 2, 8, 4, 5};
		int max_num = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max_num) {
				max_num=arr[i];
			}		
		}
		System.out.println("largest num : "+max_num);
		
		int sum_overall = max_num*(max_num+1)/2;
		
		int sum =0;
		for(int num : arr) {
			sum+=num;
		}
		
		int number = sum_overall-sum;
		System.out.println(number);
	}
}

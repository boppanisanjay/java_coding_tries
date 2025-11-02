package test;

import java.util.Arrays;
import java.util.Scanner;

public class Biggest_num_in_number {
	
	//biggest number in value in given number
	//67865   8 is biggest
	
	public static void main(String [] args) {
		try1();
	Scanner scan = new Scanner(System.in) ;
	System.out.println("Enter the number: ");
	int num = scan.nextInt();
	int count=0;
	for(int i=num;i!=0;i=i/10) {
		count++;
		
	}
	System.out.println(count);
	
	int arr[]= new int[count];
	int index = count-1;
	for(int j=num;j!=0;j=j/10) {
		int digit = j%10;
		arr[index--]=digit;
		
	}
	System.out.println(Arrays.toString(arr));
		int max=arr[0];
	for(int a:arr) {
		if(a>max) {
			max=a;
		}
	}
	System.out.println("max: "+max);
}
	
	public static void try1() {

		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		int count=0;
		int max=0;
		for(int i=num;i!=0;i=i/10) {
				int digit = i=i%10;
				if(digit>max) {
					max=digit;
				}
		}
		System.out.println(max);
	}
	
}

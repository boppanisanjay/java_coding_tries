package test1;

import java.util.Scanner;

public class Number {
	//reverse a number
	//print sum of integrers in a number
	//check prime number or not
	//find even or not
	//check palindrome
	//number of digits in a number

	static int a, b1, swap1,swap2;
	

	public static void capture_the_input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		a=scan.nextInt();
		
		
		System.out.println("Enter the number for fibonacci: ");
		 b1=scan.nextInt();
		
		System.out.println("Enter the numbers for swap: ");
		swap1=scan.nextInt();
		swap2=scan.nextInt();
		scan.close();
	
	}

	public static void odd_even() {
		int a1=a;
		if(a1%2==0) {
			System.out.println(a+" is even number");
		}
		else {
			System.out.println(a+"is odd number");
		}
	}

	public static void isPrime() {
		int b=a;
		boolean isprime =true;
		if(b==2) {
			System.out.println("Given number is prime number");
		}
		else if(b<=1) {
			System.out.println("Given number is non-prime number");
		}
		for(int i=2;i<=b/2;i++) {
			if(b%i==0) {
				isprime=false;
				break;
			}
		}
		if(isprime) {
			System.out.println("Given number is prime number");
		}
		else {
			System.out.println("Given number is non-prime number");
		}
	}
	
	public static void reverse() {
		int c=a;
		int revnum=0;
		for(int i=c;i!=0;i=i/10) {
			revnum=(revnum*10)+i%10;
		}
		System.out.println(revnum+"reverse of a number");
	}
	
	public static void numberofdigits() {
		int d=a;
		int count=0;
		for(int i=d;i!=0;i=i/10){
			count++;
		}
		
		System.out.println(count+ " number of digits");
	}
	
	public static void palindrome() {
		int e=a;
		int revnum=0;
		for(int i=e;i!=0;i=i/10) {
			revnum=(revnum*10)+i%10;
		}
		
		if(revnum==e) {
			System.out.println("Given number is palindrome: "+e);
		}
		else {
			System.out.println("Given number is non-palindrome: "+e);
		}
		
	}
	public static void sumof_integersinnumber() {
		int f=a;
		int sum=0;
		for(int i=f;i!=0;i=i/10) {
			sum=sum+i%10;
		}
		System.out.println("Sum of intergers in number: "+sum);
		
	}
	
	public static void fibonacci() {
		int first=0,second=1,next;
		System.out.print(first+","+ second);
		for(int i=0;i<=b1;i++) {
			next=first+second;
			first=second;
			second=next;
			System.out.print(", "+next);
		}
	}
	
	public static void swap() {
		int c3;
		System.out.println();
		System.out.println("before swapping: "+swap1+", "+swap2);
		c3=swap1+swap2;
		swap1=c3-swap1;
		swap2=c3-swap1;
		System.out.println("before swapping: "+swap1+", "+swap2);		
	}
	
	public static void main(String[] args) {
		capture_the_input();
		odd_even();
		isPrime();
		reverse();
		palindrome();
		sumof_integersinnumber();
		numberofdigits();
		fibonacci();
		swap();
		
	}

}

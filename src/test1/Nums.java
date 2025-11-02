package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Nums {
	static  int a,b,c,d;
		//reverse a number
		//print sum of integrers in a number
		//check prime number or not
		//find even or not
		//check palindrome
		//number of digits in a number
		//fibonnaci
		//swap
		//Find all prime numbers in a given range
	
	static void capture() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		a=scan.nextInt();
		System.out.println("Enter number for fibonacci");
		b=scan.nextInt();
		System.out.println("Enter numbers for swap");
		c=scan.nextInt();
		d=scan.nextInt();
		scan.close();
	}
	
	static void reverse() {
		int a1=a;
		int a2=a;
		int revnum=0;
		for(int i=a1;i!=0;i=i/10) {
			revnum=(revnum*10)+(i%10);
		}
		
		int revnum1 =0;
		while(a2!=0) {
			revnum1=(revnum1*10)+(a2%10);
			a2=a2/10;
		}
		
		System.out.println("for loop: "+revnum+" "+"while loop: "+revnum1 );		
	}
	
	static void sum_of_integers() {
		int a3=a;
		int sum=0;
		for(int i=a3;i!=0;i=i/10) {
			sum=sum+(i%10);
		}
		System.out.println("sum: "+sum);
	}
	
	static void prime() {
		int a4=a;
		boolean isprime=true;
		if(a<=1) {
			System.out.println("enter the number greater than or equal to 2");
		}
		else if(a>2){
			for(int i=2;i<=Math.sqrt(a4);i++) {
				if(a%i==0) {
					isprime=false;
				}
			}
		}
		
		if(isprime) {
			System.out.println("Given number is prime: "+a4);
		}
		else {
			System.out.println("Given number is non-prime: "+a4);
		}	
	}
	
	static void even_odd() {
		int a5=a;
		if(a5%2==0) {
			System.out.println("Given number is even number");
		}
		else {
			System.out.println("Given number id odd number");
		}
	}
	
	static void palindrome() {
		int a6 =a;
		int rev=0;
		for(int i=a6;i!=0;i=i/10) {
			rev = (rev*10)+i%10;
		}
		if(rev==a6) {
			System.out.println("Given number is palindrome");
		}
		else {
			System.out.println("Given number is non-palindrome");
		}
	}
	static void no_of_digits() {
		int a7=a;
		int count=0;
		for(int i=a7;i!=0;i=i/10) {
			count++;
		}
		System.out.println("number of digits: "+count);
	}
	static void fibonacci() {
		int first =0;
		int second=1;
		int next=0;
		System.out.print(first+", "+second);
		for(int i=2;i<b;i++) {
			next=first+second;
			first=second;
			second=next;
			System.out.print(","+next);
		}
		System.out.println();
	}
	static void swap() {
		int c1=c;
		int d1=d;
		System.out.println("Numbers before swap c: "+c1+" d: "+d1);
		int num=c1+d1;
		c1=num-c1;
		d1=num-c1;
		System.out.println("Numbers after swap c: "+c1+" d: "+d1);
	}
	
	static void prime_nos_in_range() {
		int c2=c;
		int d2=d;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=c2;i<=d2;i++) {
			boolean isprime=true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					isprime=false;
				}				
			}
			if(isprime) {
				list.add(i);
			}
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
	    capture();
	    System.out.println("---- Reverse Number ----");
	    reverse();
	    System.out.println("---- Sum of Digits ----");
	    sum_of_integers();
	    System.out.println("---- Prime Check ----");
	    prime();
	    System.out.println("---- Even or Odd ----");
	    even_odd();
	    System.out.println("---- Palindrome Check ----");
	    palindrome();
	    System.out.println("---- Number of Digits ----");
	    no_of_digits();
	    System.out.println("---- Fibonacci Series ----");
	    fibonacci();
	    System.out.println("---- Swap Numbers ----");
	    swap();
	    System.out.println("---- Prime numbers in range ----");
	    prime_nos_in_range();
	}


}

package test;

import java.util.Scanner;

public class Occinstring {
	public static void main(String[] args) {
		try1();
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter the string: ");
		String a = scan.nextLine();
		
		for(int i =0;i<a.length();i++) {
			char character = a.charAt(i);
			
			boolean repeat =false;
			for(int k=0; k<i;k++) {
				if(a.charAt(k) == character) {
					repeat =true;
				}
			}
			
			int count =0;
			if(!repeat) {
			for(int j=0; j<a.length();j++) {
				if(a.charAt(j) == character) {
					count++;
				}
			}
			System.out.println(character +" : "+count);
		}	
		}
		
		
	}
	
	public static void try1() {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter the string: ");
		String a = scan.nextLine();
		
		int len = a.length();
		
		for(int i=0;i<len;i++) {
			
			char character = a.charAt(i);
			
			boolean dup = false;
			for(int j=0;j<i;j++) {
				if(a.charAt(j)==character) {
					dup =true;
				}
			}
			int count =0;
			if(!dup) {
				for(int k=0;k<len;k++) {
					if(a.charAt(k)==character) {
						count++;
					}
				}
				System.out.println(character+" is occured "+count+" times");
			}
			
			
		}
	}

}

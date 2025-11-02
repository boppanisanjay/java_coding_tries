package test;

import java.util.Scanner;

public class duplicatedin_string {
	//Find duplicate characters in a string.

	public static void main(String[] args) {
		try1();
		duplicate();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String a = scan.nextLine();

		int length = a.length();

		for(int i=0;i<length;i++) {
			char character = a.charAt(i);

			boolean dup = false;
			for(int k=0;k<i;k++) {
				if(a.charAt(k)==character) {
					dup =true;
				}
			}
			if(!dup) {
				int count=0;
				for(int j=0;j<length;j++) {
					if(character == a.charAt(j)) {
						count++;
					}
				}
				if(count>1) {
					System.out.println(character+" is duplicated "+ count+" times" );
				}
			}
		}
	}
	
	public static void duplicate() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String b = scan.nextLine();

		int length = b.length();

		for(int i=0;i<length;i++) {
			char character = b.charAt(i);

			boolean dup = false;
			for(int j=0;j<i;j++) {
				if(b.charAt(j)==character) {
					dup = true;
				}				
			}			
			int char_count=0;
			if(!dup) {
				for(int k=0;k<length;k++) {
					if(b.charAt(k)==character) {
						char_count++;
					}
				}
			}
			if(char_count>1) {
				System.out.println(character+" Chararcter count is duplicated "+char_count+" times");
			}
		}	
	}
	
	public static  void try1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = scan.nextLine();
		int len = s.length();
		
		for(int i=0;i<len;i++) {
			char character = s.charAt(i);
			int count =0;
			boolean dup = false;
			for(int j=0;j<i;j++) {
				if(s.charAt(j)==character) {
					dup=true;
				}
			}
			if(!dup) {
				for(int k=0;k<len;k++) {
					if(s.charAt(k)==character) {
						count++;
					}
				}
			}
			
			if(count>1) {
				System.out.println(character+" is duplicated "+count+" times");
			}
		}
		
	}
}

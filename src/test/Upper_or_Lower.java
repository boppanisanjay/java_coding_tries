package test;

import java.util.Scanner;

public class Upper_or_Lower {
	/*. Find whether entered character in console is an upper case or lower case 

Input: a 

Output: Lower case 

Input: K 

Output: upper case */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
			System.out.println("enter the character");
			char a1 =scan.next().charAt(0);
			
			if(a1>='A' && a1<='Z') {
				System.out.println("uppercase");
			}
			else {
				System.out.println("lowercase");
			}
		
	}

}

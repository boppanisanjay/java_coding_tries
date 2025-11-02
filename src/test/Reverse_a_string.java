package test;

import java.util.Scanner;

public class Reverse_a_string {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String a = scan.next();
		
		int length = a.length();
		String strrev = "";
		
		for (int i=length-1;i>=0;i--) {
			char a1 = a.charAt(i);
			strrev=strrev+a1;
		}
		System.out.println(strrev);
	}

}

package test1;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {
	//reverse string
	//reverse each word in program (hello world -> olleh dlrow)
	//Number of words in sentence
	//palindrome
	//count vowels and consonants in string
	//Reverse a complete sentence

	static String a,b;
	public static void capture() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		a=scan.nextLine();

		System.out.println("Enter the sentence: ");
		b=scan.nextLine();




		scan.close();		
	}

	public static void reverse() {
		String a1=a;
		String rev ="";
		for(int i=a1.length()-1;i>=0;i--) {
			rev=rev+(a1.charAt(i));
		}
		System.out.println("String reversed: "+rev);
	}

	public static void sentence_reverse() {
		String b1=b;
		String []words=b1.split(" ");
		String sen_rev="";
		for(String word:words) {
			String rev ="";
			for(int i=word.length()-1;i>=0;i--) {
				rev=rev+(word.charAt(i));
			}
			sen_rev=sen_rev+rev+" ";
		}		
		System.out.println("Sentemce reverse: "+sen_rev);	
	}
	public static void remove_gaps() {
		String b2=b;
		String []words=b2.split(" ");
		System.out.println(Arrays.toString(words));
		String without_space="";
		for(String a:words) {
			without_space=without_space+a;
			
		}
		System.out.println(without_space);
	}

	public static void palindorme() {
		String a2=a;
		String rev ="";
		for(int i=a2.length()-1;i>=0;i--) {
			rev=rev+(a2.charAt(i));
		}
		if(a2.equals(rev)) {
			System.out.println("The given word "+a2+"is Palindrome");
		}
		else {
			System.out.println("The given word "+a2+"is Palindrome");
		}
	}
	
	public static void no_ofwords() {
		String b2=b;
		String []words=b2.split(" ");
		System.out.println("No of words in string "+b2+": "+words.length);
	}
	
	public static void vowels_and_consonants() {
		String a3=a;
		int consonats_count=0,vowels_count=0;
		for(int i=a3.length()-1;i>=0;i--) {
			char chr=a3.charAt(i);
			if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u') {
				vowels_count++;
			}
			else {
				consonats_count++;
			}
		}
		System.out.println("Vowles count: "+vowels_count+" and Consonants count: "+consonats_count);
	}
	
	public static void reverse_a_complete_sentence() {
		String b3=b;
		String rev_sen="";
		String words[]=b3.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			String word=words[i];
			String rev="";
			for(int j=word.length()-1;j>=0;j--) {
				rev=rev+word.charAt(j);
			}
			rev_sen=rev_sen+rev+" ";
		
		}
		System.out.println(rev_sen);
		
	}
	public static void main(String[] args) {
		capture();
		reverse();
		sentence_reverse();
		palindorme();
		no_ofwords();
		vowels_and_consonants();
		reverse_a_complete_sentence();
		remove_gaps();
		
	}
}

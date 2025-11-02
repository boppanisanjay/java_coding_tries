package test;

import java.util.Scanner;

public class Occurenecies_in_string {

	static void ocs() {


		//Count the occurrences of a specific character in a string.


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String a = scan.next();
		int length = a.length();
		if(length!=0) {
			for(int i=0;i<length;i++) {
				char charatcurrent = a.charAt(i);
				int count = 0;
				for(int j =0;j<length;j++) {
					if(a.charAt(j) ==  charatcurrent) {
						count++;
					}


				}
				System.out.println(charatcurrent+"ocs :"+count);

			}
		}
	}


    public static void main(String[] args) {
    	ocs();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            /*
            // Check if this character appeared earlier
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (input.charAt(k) == current) {
                    alreadyCounted = true;
                    break;
                }
            }*/

            // Only count if not already counted
            //if (!alreadyCounted) {
                int count = 0;
                for (int j = 0; j < input.length(); j++) {
                    if (input.charAt(j) == current) {
                        count++;
                    }
                }
                System.out.println(current + " : " + count);
            //}
        }

        scan.close();
    }
}

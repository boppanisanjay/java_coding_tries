package test1;

import java.util.Arrays;

public class Reverse_an_array {
	
	public static void reverse() {
	//reverse array
	int [] arr = {1,4,2,7,3,5};
	int [] rev = new int[arr.length];
	
	
for(int i=0;i<arr.length;i++) {
	rev[arr.length-1-i]=arr[i];
}

System.out.println(Arrays.toString(rev));
	}
	
	public static void main(String[] args) {
		reverse();
	}
}

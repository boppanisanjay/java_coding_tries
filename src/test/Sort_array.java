package test;

import java.util.Arrays;

public class Sort_array {
    public static void main(String[] args) {
    	try1();
        int arr[] = {23, 12, 32, 21, 54, 45, 23, 87, 95, 109, 11};

        // Bubble sort using two for loops
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {//23,12
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    
    public static void try1() {
    	 int arr[] = {23, 12, 32, 21, 54, 45, 23, 87, 95, 109, 11};
    	 for(int i=0;i<arr.length;i++) {
    		 for(int j=0;j<arr.length-1-i;j++) {
    			 if(arr[j]>arr[j+1]) {
    				 int temp = arr[j];
    				 arr[j]=arr[j+1];
    				 arr[j+1]= temp;
    			 }
    		 }
    	 }
    	 System.out.println(Arrays.toString(arr));
    }
}


//{23, 12, 32, 21, 54, 45, 23, 87, 95, 109, 11}

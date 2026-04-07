package dataArrays;

import java.util.Scanner;

public class practiceArray {
	public static void main(String[] args) {
	int[] arr = new int[4];
	Scanner scan = new Scanner(System.in);
	
	for(int i =0; i < arr.length; i++) {
		System.out.println("Enter number: ");
		int value = scan.nextInt();
		arr[i] = value;
	}
	int min = Integer.MAX_VALUE;
	for(int j = 0; j < arr.length; j++) {
		if (arr[j] < min){
			min = arr[j];
		}
	}
	System.out.println("Minimum number in the array is: " + min);
}
}

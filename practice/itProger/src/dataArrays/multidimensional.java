package dataArrays;

import java.util.Scanner;

public class multidimensional {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] syms = new char[2][2];
		syms[0][0]= 't';
		
		int[][] nums = new int[][] {
			{5, 7},
			{7,3},
			{2,8}};
			
			nums[1][1] = 67;
			
			for(int i=0; i<nums.length; i++) {
				for(int j=0; j<nums[i].length; j++) {
					nums[i][j] = scan.nextInt();
				}
			}
			for(int i=0; i<nums.length; i++) {
				for(int j=0; j<nums[i].length; j++) {
					System.out.print(nums[i][j] + " "); }
				
			System.out.println();
			}
				}
			
	}


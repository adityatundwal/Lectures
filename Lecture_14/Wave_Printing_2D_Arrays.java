package Lecture_14;

import java.util.Scanner;

public class Wave_Printing_2D_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of N");
		int n = sc.nextInt();
		System.out.println("Enter Value of M");
		int m = sc.nextInt();
		int [] [] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
			
		}
		
		Display(arr);

	

	}

	private static void Display(int[][] arr) {}

}

package Lecture_9;

import java.util.Scanner;

public class take_io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  
		
		//creation
		
		int []arr = new int[n];    		
		
		//input
		
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		display(arr);
		
	}
	
	public static void display(int []arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}

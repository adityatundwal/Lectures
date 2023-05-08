package Lecture_5;

import java.util.Scanner;

public class Binary_To_Decimal_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		int mult = 1;
		
		while(n>0) {
			int rem = n%10;
			sum = sum+rem*mult;
			mult = mult*2;
			n = n/10;
			
		}
		System.out.println(sum);

	

	}

}

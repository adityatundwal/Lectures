package Lecture_5;
import java.util.Scanner;
public class Decimal_To_Binary_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		int mult = 1;
		
		while(n>0) {
			int rem = n%2;
			sum = sum+rem*mult;
			mult = mult*10;
			n = n/2;
			
		}
		System.out.println(sum);

	}

}

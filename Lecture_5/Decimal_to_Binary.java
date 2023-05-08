package Lecture_5;


public class Decimal_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 78;
		
		int sum = 0;
		int multiplier = 1;
		
		while(n>0) {
			int rem = n % 2;
			sum = sum + rem*multiplier;
			multiplier = multiplier *10;
			n = n/2;
		}
		System.out.println(sum);

	}

}

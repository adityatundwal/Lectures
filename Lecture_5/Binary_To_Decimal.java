package Lecture_5;
public class Binary_To_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1010101;
		
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

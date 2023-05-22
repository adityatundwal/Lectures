package Lecture_18;

public class Power {
	
	//self helped by monu bhaiya first approach is correct

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		int b = 6;
		System.out.println(power(a,b));
		

	}
	
	public static int power(int a, int b) {
		
		if(b ==0) {
			return 1;
		}
		int pow = power(a, b-1);
		return pow*a;
	}

}

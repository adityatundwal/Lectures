package lecture_1;

public class Sum_Of_Consecutive_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int i = 0;
		int sum = 0; // use it to store the calculations
		
		
		while(i <= n) {
			System.out.println(sum);
			sum = sum+i;
			i = i+1;
		}
	}

}

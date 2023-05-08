package lecture_2;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner Pattern0 = new Scanner(System.in);  //Most important for taking input
		
		int n = Pattern0.nextInt();   // same as above		
		int i = 1;
		while(i <= n) {
			System.out.print("*"+" ");
			i++;
		}
		

	}

}

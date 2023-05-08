package lecture_2;
import java.util.Scanner;
public class Pattern_Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n-2;
		int star = n;
		
		while (row <= n) {
			int i =1;
			while (i<=space) {
				System.out.print("    ");
				i++;
			}
			
			int j = 1;
			while(j<=star) {
				System.out.print("* ");
				j++;
		
			}
			
			row++;
			System.out.println();
			space++;
			star--;
			
		}
		
	}
	
}